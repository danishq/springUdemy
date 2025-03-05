class MyException extends Exception{
    public MyException(String string){
        super(string);
        //We need super(string) -> because if not using super it will print only 
        //Thats the default outputMyException
        //18
        //Bye
        // using super it will override the constructor of expception class and print the message : i dont want to print zeo
        //
        //
    }
}
public class lec90{

    public static void main(String args[])
    {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
                throw new MyException("I dont want to print zero");
        }
        catch(MyException e){
            j=18/1;
            System.out.println("Thats the default output : " + e);
        }
        catch(Exception e){
            System.out.println("Something Went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    } 
}
