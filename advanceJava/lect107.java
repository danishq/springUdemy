
//Stream API Deep Dive
import java.util.Arrays;
import java.util.List;

public class lect107 {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

    int result = nums.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .reduce(0, (c, e) -> c + e);
    System.out.println(result);
  }

}
/*
 * use cant reuse the stream
 *
 * Stream<Integer> s1 = nums.stream();
 * Stream<Integer> s4 = nums.stream();
 * Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
 * 
 * Stream<Integer> s3 = s4.map(n -> n * 2);
 * int result = s3.reduce(0, (c, e) -> c + e);
 *
 * s2.forEach(n -> System.out.println(n));
 * System.out.println("---------------------");
 * System.out.println(result);
 *
 * s3.forEach(n -> System.out.println(n));
 *
 *
 */
