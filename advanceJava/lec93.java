// Try with Resources
import java.io.*;
import java.util.Scanner;

public class lec93 {
  public static void main(String[] args) {
    // int i = 0;
    // int j = 0;

    // try {
    // j = 18 / i;
    // // System.out.println("Bye");

    // } catch (Exception e) {
    // System.out.println("Something went wrong");
    // // System.out.println("Bye");
    // } finally {
    // System.out.println("Bye");
    // }
    BufferedReader br = null;
    int num = 0;
    try {
      InputStreamReader in = new InputStreamReader(System.in);
      br = new BufferedReader(in);
      num = Integer.parseInt(br.readLine());
      System.out.println(num);
    } catch (Exception e) {
      System.out.println("Enter a number");
    } finally {
      try {
        br.close();
      } catch (Exception e) {
        System.out.println("br did not close");
      }
    }
  }
}
/*
 * In try block if we want to pring "bye" and we get exception it wont print
 * "bye"
 * because j =18/i; will throw exception and the next line executed will be of
 * catch block skipping "bye". and if we write "bye" in catch block then if try
 * does
 * not give error the line executed will never reach the "bye" statement in
 * catch
 * block.
 * if we want a line to be executed regarless. we cant write it in finally block
 * Finally has also one more thing to do. it also closes the resources. this is
 * helpful when we want to close the buffer
 * Finally also has a try and catch inside it because if "br.close()" requrie
 * handling IOException which is a checked exception so have to handle it or we
 * can use "throws" in our main function which we should never do that.
 * So we have to handle this br.close exception with a try and catch inside out
 * final block.
 * THERE IS ALSO ANOTHER WAY (SHORCUT) TO DO THIS. bufferedreader is also autoclosable.
 * int num =0;
 * try(BufferedReader br = new BufferedReader(new InputStream(Syste.in) ) ){
 *   num = Integer.parseInt(br.readLine());
 * }
 *
 *
 */
