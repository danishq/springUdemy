// Static Variable
class Mobile{
    String brand;
    int price;
    static String name;
    void show(){
        System.out.println(brand+":"+price+":"+name);
    }
}
// It is a standard practice to call static variable by
// class name not by object name
// example obj1.name="phone" is not correct & 
// Mobile.name = "phone" is correct
public class lec41 {
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

    }
}
/*
    Static var are only created once immediately when program is run and static var are shared across class. "name" var in this code is shared for obj1 
    and obj2. changing for obj1 will result in obj2 will also change so for every object "name" will be same.
    so it is better to call "name" var by its class name not by object name.


*/