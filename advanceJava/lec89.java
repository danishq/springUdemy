//Exception Throw Keyword

class lec89{
    public static void main(String args[])
    {
        int i=2;
        int j=0;

        try{
            j=18/i;

            if(j==9)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            j=18/i;
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Something Went Wrong");
        }
        System.out.println(j);
        System.out.println("BYE");
    }
}


/* 
 *
 *
Feature	                class lec89 {} (default)                	public class lec89 {}
Access Level	        Only accessible within the same package 	Accessible from any package
Filename Restriction	No restriction	                                Must match class name (lec89.java)
Compilation Error?	No error	                                Error if filename does not match class name
 */
