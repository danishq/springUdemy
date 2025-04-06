
// Array List
import java.util.ArrayList;
import java.util.*;

public class lect101 {
  public static void main(String[] args) {

    List<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

    for (int n : nums) {
      // System.out.println(n);
      int x = (Integer) n;
      System.out.println(x * 2);

    }

    System.out.println(nums.get(4));
  }

}
