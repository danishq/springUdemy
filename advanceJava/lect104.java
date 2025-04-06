// Comparator vs Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class lect104 {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if (i < j) {
          return 1;
        } else {
          return -1;
        }

      }
    };

    Comparator<String> cmp = new Comparator<String>() {
      public int compare(String i, String j) {
        if (i.length() < j.length()) {
          return 1;
        } else {
          return -1;
        }

      }
    };

    List<String> l1 = new ArrayList<>();
    l1.add("abcd");
    l1.add("abc");
    l1.add("ab");
    l1.add("a");
    nums.add(1);
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    nums.add(6);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    nums.add(6);

    Collections.sort(nums, com);
    Collections.sort(l1, cmp);

    System.out.println(nums);
    System.out.println(l1);

  }
}
