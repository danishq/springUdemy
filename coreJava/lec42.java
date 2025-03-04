// Static Methods
class Mobile{
    String brand;
    int price;
    static String name;
    void show(){
        System.out.println(brand+":"+price+":"+name);
    }
    public static void show1(Mobile obj){
        System.out.println("show static method");
        // System.out.println(brand+":"+price+":"+name);  --> This is wrong 
        //to use non static variable in static variable we have to pass object also
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}
public class lec42 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=1500;
        Mobile.name="smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand="samsung";
        obj2.price=900;
        // obj2.name="smartphone";

        // obj1.name="phone";
        obj2.show();

        // obj1.show1();  --> This is wrong
        Mobile.show1(obj2);
        // obj2.show1(obj2); 
        //This above code throws warning that static method should be accessed in static way

        /*
            We have a main class which is static. The reason we need this as static is to start this class.
            If this was not static first we would need to make an object of main class but how can we make object of main class.
            We can't because we need to run the file. to run the file we need main class but again we need object of main class.
            so its a never ending loop. a paradox. its a deadlock situation.
            thats why main class is always and it must be static.
        */

    }
}
