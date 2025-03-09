<<<<<<< Updated upstream
// Try with multiple catch
class lec87{
    public static void main(String[] args) {
        int i=0;
        int j=0;
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
=======
// Try with multiple catch
class lec87{
    public static void main(String[] args) {
        //something
        int i=0;
        int j=0;
        
        int nums[] = new int[5];

        try{
            j=18/i; // exception: cannot divide by zero
            System.out.println(nums[1]);
            System.out.println(nums[5]); // Index out of bound 5
            
        }
        catch(ArithmeticException e){
            System.out.println("something Went Wrong. " + e);

        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Stay in your limit");
            
        }
        System.out.println(j);
        System.out.println("Bye");

    }
}
>>>>>>> Stashed changes
