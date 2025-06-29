
//constructor reference
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
  private String name;
  private int age;

  public Student() {

  }

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }
}

public class lect112 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Navin", "Harsh", "John");

    List<Student> std_name = new ArrayList<>();
    // for (String n : names) {
    // std_name.add(new Student(n));
    // }
    // std_name = names.stream()
    // .map(name -> new Student(name))
    // .collect(Collectors.toList());
    // we can also use .toList();

    std_name = names.stream()
        .map(Student::new)
        .toList();
    System.out.println(std_name);
  }
}
