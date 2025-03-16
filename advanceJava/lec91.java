// Ducking Exceptions using throws
class A {

  public void show() throws ClassNotFoundException {
    Class.forName("lec91");
  }
}

public class lec91 {
  static {
    System.out.println("Class is Loaded");
  }

  public static void main(String[] args) {
    A obj = new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

/*
 * throws is used when we write method and dont want to handle exception or it
 * is not wise to handle exception now but the A class that will call the method
 * or the parent class that will call the A class. that class will handle the
 * exception. we just have to throws the exception in the method which is
 * showing the exception.
 * the syntax if throws is not used
 * 
 * public void show()
 * {
 * try {
 * Class.forName("lec91");
 * } catch (ClassNotFoundException e) {
 * // TODO: handle exception
 * System.out.println("Not able to find the class");
 * }
 * }
 * now after throws ClassNotFoundException in line 4 we will have to handle it
 * in main function because main function is calling the show method of A class.
 * there is also technically a possiblity that we dont have to handle it in main
 * class and we can use throws in main method as well. so the JVM will handle
 * the execution.
 * and JVM will simply stop the executoin, but it is not a smart thing to do.
 *
 */
