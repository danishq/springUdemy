import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class lect108 {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
    Predicate<Integer> p = new Predicate<Integer>() {
      public boolean test(Integer t) {
        if (t % 2 == 0) {
          return true;
        }
        return false;
      }
    };

    Function<Integer, Integer> func = new Function<Integer, Integer>() {
      public Integer apply(Integer n) {
        return n * 2;
      }
    };

    int result = nums.stream()
        .filter(p)
        .map(func)
        .reduce(0, (c, e) -> c + e);
    System.out.println(result);

  }
}
/*
 * previous code is the same but more deep dive on what is happening behind the
 * scene in filter and map,
 * filter use predicate and it is a functional interfaces
 * map use Function and it is a functional interfaces
 * Next Topic is similar but using the filter or other logic with multiple
 * threads to make work more quick.
 */
