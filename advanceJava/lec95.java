
// Multiple Threads

class A extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("Hi");
    }
  }
}

class B extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("hello");
    }
  }
}

class lec95 {

  public static void main(String args[]) {
    A obj1 = new A();
    B obj2 = new B();

    obj1.start();
    obj2.start();
  }
}
/*
 * The normally works in a sequence starting from main method
 * This lec95 is about how to run two thread simaltaniously
 * Schedular in JAVA, Many thread run at the same time and which thread to
 * execute when and for how much time this is the job of schedular.
 */
