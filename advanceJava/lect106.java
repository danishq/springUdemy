//for each method

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lect106 {

  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
    Consumer<Integer> con = new Consumer<Integer>() {
      public void accept(Integer n) {
        System.out.println(n);
      }
    };
    nums.forEach(con);

    nums.forEach(n -> System.out.println(n));
  }
}

/*
 * forEach require a object of list or set or any collection to work. its job is
 * to filter and show the filtered data
 * forEach to work we need a Consumer object, since consumer class is a
 * functional class then lambda function can be used
 * instead of writing this:
 * Consumer<Integer> con = new Consumer<Integer>(){
 * public void accept(Integer) {
 * System.out.println(n);
 * }
 * }
 * nums.forEach(con);
 *
 * since it is a functional interface we can write lamda exppression
 *
 * Consumer<Integer> con = n -> System.out.println(n);
 *
 * consumer<Integer> con is the first part and because Integer n is the only
 * parameter it can be written as mentioned above
 * then -> create anonymous class and we mention the method in this.
 * if we don't want to reduce it this much we can also write
 * Consumer<Integer> con = (Integer n) -> System.out.println(n);
 *
 *
 * Consumer<Integer> con = n -> System.out.println(n);
 * we can also use this line inside forEach method as well like this:
 * nums.forEach(n -> System.out.println(n));
 * 
 */
