// What is ENUM

enum Status{
   Running, Failed, Pending, Success; 
}

public class lec77 {
    public static void main(String[] args) {
       int i=5;
       Status s=Status.Success;

       System.out.println(s);
       System.out.println(s.ordinal());

       

       
    }
}
