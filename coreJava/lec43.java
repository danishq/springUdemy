// Static Block
class Mobile{
    String brand; //instance variable
    int price;
    static String name;
    // This is static block. It will call only one time. 
    static{
        name="phone";
        System.out.println("static block");
        //This is better than making it in constructor.
    }
    //This is constructor
    public Mobile(){
        brand="";
        price=200;
        System.out.println("constructor");
        // name="Phone"; we don't need this bcz it is static
    }
}
public class lec43 {
    public static void main(String[] args) throws ClassNotFoundException{
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=1500;
        Mobile.name="smartphone";
        // Mobile obj2 = new Mobile();
        // if above code was not there or commented using line 38 static block will still be called.
        //This will load only the class but won't create any object.
        /*
            This reason for this is if we create static block it will be create just after the class.
            And if we don't create any object. lets say i just made a class but did not made any object then static block won't be called.
            But i want to load a class or call a class without creating any object of class. we can use below code calling class wihtout making any
            object.
            However we need to mention throw exception in main class.
            *note: IF WE DONT CALL ANY OBJECT IT THEN CLASS WILL ALSO NOT BE CALLED.
                if we want to call class without creating any object below is how we do it.
        */
        Class.forName("Mobile");
        
        
    }
}
//OUTPUT before
// static block
// constructor
// constructor

// After
// static block 
