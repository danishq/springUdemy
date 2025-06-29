
// Method Reference
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class lect111 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor");
    List<String> uNames = names.stream()
        // .map(name -> name.toUpperCase())
        .map(String::toUpperCase)
        .toList();

    // System.out.println(uNames);
    // uNames.forEach(n -> System.out.println(n)); Look up forEach Method
    uNames.forEach(System.out::println); // This is method Reference

  }
}
// Converting this code
// .map(name -> name.toUpperCase())
// .map(String::toUpperCase)
// This also works and this is called method refeerence
