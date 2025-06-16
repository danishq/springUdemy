
//Stream API Deep Dive
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lect107 {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

    Stream<Integer> s1 = nums.stream();
    Stream<Integer> s4 = nums.stream();
    Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

    Stream<Integer> s3 = s4.map(n -> n * 2);

    s2.forEach(n -> System.out.println(n));
    System.out.println("---------------------");

    s3.forEach(n -> System.out.println(n));

  }
}
/*
 * use cant reuse the stream
 *
 *
 *
 */
