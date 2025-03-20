// Try with multiple catch
class lec87 {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int nums[] = new int[5];

    try {
      j = 18 / i; // This line throws an ArithmeticException because you're dividing by zero.
      System.out.println(nums[1]); // This line is not reached because of the exception in the previous line.
      System.out.println(nums[5]); // This line would throw an ArrayIndexOutOfBoundsException if it were reached.
    } catch (ArithmeticException e) {
      System.out.println("something went wrong: " + e.getMessage()); // Handle ArithmeticException
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("something went wrong: " + e.getMessage()); // Handle ArrayIndexOutOfBoundsException
    }
    System.out.println(j);
    System.out.println("bye");

  }
}
