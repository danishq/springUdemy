// Ducking Exceptions using throws
public class lec91 {
  public static void main(String[] args) {

    try {
      Class.forName("someClass");
    } catch (ClassNotFoundException e) {
      // TODO: handle exception
      System.out.println("Not able to find the class");
    }
  }
}
