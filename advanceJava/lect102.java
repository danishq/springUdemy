
// Array List
import java.util.*;

public class lect102 {
  public static void main(String[] args) {

    // Set<Integer> nums = new HashSet<Integer>();
    Set<Integer> nums = new TreeSet<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    nums.add(0);
    nums.add(5);
    nums.add(62);
    nums.add(54);
    nums.add(82);
    nums.add(21);

    // for (int n : nums){
    // System.out.println(n);

    // }
    Iterator<Integer> values = nums.iterator();
    while (values.hasNext()) {
      System.out.println(values.next());
    }

  }
}
/*
 * Set will not have reptitive values
 * But TreeSet will not only have unique value it will also sort the values.
 * output will be :
 * 0 1 2 3 4 5
 * 
 */
