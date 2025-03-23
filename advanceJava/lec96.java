// Thread Priority and sleep

class A extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class B extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class lec96 {

  public static void main(String args[]) {
    A obj1 = new A();
    B obj2 = new B();

    // obj2.setPriority(8);
    // System.out.println(obj1.getPriority());

    obj1.start();
    try {
      Thread.sleep(2);
    } catch (Exception e) {
      e.printStackTrace();
    }
    obj2.start();
  }
}
