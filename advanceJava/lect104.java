
// Comparator vs Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

class Student implements Comparable<Student> {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age =" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(Student that) {
    if (this.age <= that.age) {
      return 1;
    } else {
      return -1;
    }
  }

}

public class lect104 {
  public static void main(String[] args) {

    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if (i < j) {
          return 1;
        } else {
          return -1;
        }

      }
    };

    List<Student> l1 = new ArrayList<>();
    l1.add(new Student(43, "Amit"));
    l1.add(new Student(53, "Sumit"));
    l1.add(new Student(63, "Jatin"));
    l1.add(new Student(73, "Pranav"));
    l1.add(new Student(83, "John"));
    l1.add(new Student(93, "Navin"));

    Collections.sort(l1);

    for (Student s : l1) {
      System.out.println(s);
    }

  }
}
