// Lec 97. -> Runnable vs Thread

class A implements Runnable {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class B implements Runnable {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class lec97 {
  public static void main(String[] args) {

    Runnable obj1 = new A();
    Runnable obj2 = new B();
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    // obj1.start();
    t1.start();
    t2.start();
    try {
      Thread.sleep(2);
    } catch (Exception e) {
      e.printStackTrace();
    }
    // obj2.start();
  }
}
/*
 * Thread is a class which implements Runnable, Runnable is an interface.
 * If we don't use Runnable and use thread, then we cant extends the current to
 * a some partent class. Because multiple inheritance don't work in java.
 * See more with runnable docs.
 * Runnable
 * We need to create thread objects, because runnable interface do have thread
 * methods. with thread class implements runnable.
 *
 *
 * Lambda Expression is :
 * Runnable obj1 = new Runnable(){
 * public void run() {
 * for (int i = 1; i <= 5; i++) {
 * System.out.println("Hi");
 * try {
 * Thread.sleep(10);
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 * };
 *
 * Becomes this in lamda expression :
 *
 * * Runnable obj1 =() ->
 * public void run() {
 * for (int i = 1; i <= 5; i++) {
 * System.out.println("Hi");
 * try {
 * Thread.sleep(10);
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * };
 * 
 *
 * Above is Anonymous class, and because of that we wont be needing class A
 * implements Runnable and class B implements Runnable. We can reduce the line
 * of code this way.
 *
 *
 *
 *
 *
 */
