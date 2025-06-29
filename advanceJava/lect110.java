
// Optional Class
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class lect110 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor");
    String name = names.stream()
        .filter(str -> str.contains("x"))
        .findFirst()
        .orElse("Not Found");
    System.out.println(name);
  }

}
