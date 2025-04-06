// Wrapper Class
public class lec64 {
  public static void main(String[] args) {
    int num = 7;

    Integer num1 = 8; // This is auto boxing
    Integer num2 = num;
    // Integer num1 = new Integer(num); *This is boxing This syntax is deprecated*

    System.out.println(num1);

    // Is everything working out correctly

    System.out.println(num1);
    System.out.println(num2);

    // Unboxing
    // int num3 = num2.intValue(); This is explicit unboxing
    int num3 = num2;
    // Here num3 is primitive type and num2 in Integer type so this is auto unboxing
    System.out.println(num3);

    String s = "123";
    int num_s = Integer.parseInt(s);
    System.out.println(num_s);

  }
}
/*
 * int -> Integer
 * 
 * 
 * Core Java Section is DONE
 */
