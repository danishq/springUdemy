
// ParallelStream
//
#Lect109
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class lect109 {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(1000);
    Random rn = new Random();
    for (int i = 0; i < 1000; i++) {
      nums.add(rn.nextInt(100));
    }

    long s1 = System.currentTimeMillis();
    int sum2 = nums.stream()
        .map(i -> {

          try {
            Thread.sleep(1);
          } catch (Exception e) {
          }

          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();

    long e1 = System.currentTimeMillis();
    long s2 = System.currentTimeMillis();
    int sum3 = nums.stream()
        .map(i -> {

          try {
            Thread.sleep(1);
          } catch (Exception e) {
          }

          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();

    long e2 = System.currentTimeMillis();
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println("first " + (e1 - s1));
    System.out.println("second " + (e2 - s2));
  }

}
