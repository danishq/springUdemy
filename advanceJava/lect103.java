// Map

import java.util.*;

public class lect103 {
  public static void main(String[] args) {
    Map<String, Integer> students = new HashMap<>();
    students.put("Navin", 56);
    students.put("Harsh", 56);
    students.put("Sushil", 56);
    students.put("Kiran", 56);
    students.put("Purush", 56);

    System.out.println(students);

    for (String key : students.keySet()) {
      System.out.println(key + ": " + students.get(key));
    }
  }
}
/*
 * There is two type of map : 1.HashTable, 2.HashMap
 * Hashtable is synchronized and hashmap is not.
 * If we are using threads and map. Then is makes sense to use hashtable because
 * it work with synchronized threads.
 */
