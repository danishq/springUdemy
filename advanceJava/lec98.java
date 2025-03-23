
// Race Condition && Mutation
import java.lang.Runnable;

class counter {
  int count;

  public synchronized void increment() {
    count++;
  }
}

public class lec98 {
  public static void main(String[] args) {

    counter c = new counter();

    Runnable obj1 = () -> {
      for (int i = 1; i <= 1000; i++) {
        c.increment();
      }
    };

    Runnable obj2 = () -> {

      for (int i = 1; i <= 1000; i++) {
        c.increment();
      }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (Exception e) {
      // TODO: handle exception
    }

    System.out.println(c.count);

  }
}

/*
 * Mutation with thread is not a good idea.
 * Suppose we have a variable "i" =0;
 * if t1 and t2 will now try to change 'i' at the same time and now"i"will
 * change two times result in unwanted behaviour
 * System.out.println("hello hello hi ");
 * The main is printing the value of count while the t1 and t2 thread are
 * working at the same time.
 * What compiler is doing : after starting the thread t1 and t2, then the main
 * func will print the sout(count), meanwhile t1 and t2 are doint thier work.
 *
 * 
 */
