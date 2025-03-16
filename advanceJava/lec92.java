
// User Input using BufferedReader and Scanner
import java.io.*;
import java.util.Scanner;
public class lec92 {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter a Number");
    // int num = System.in.read();
    // This gives only the ascii value of the inputer from a keyboard. so We
    // substract 48 to get actual number. Because integer 1 is 48 in ascii value.
    // We use BufferedReader instead to read our input.

    //InputStreamReader in = new InputStreamReader(System.in);
    //BufferedReader bf = new BufferedReader(in);

    //int num = Integer.parseInt(bf.readLine());
    //System.out.println(num);

    //bf.close();


    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(num + " this is a number");
    sc.close();

  }
}
