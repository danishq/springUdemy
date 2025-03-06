// Abstract and Anonymous Inner Class
abstract class A{
    public abstract void show();
    public abstract void config();
}
class B extends A{
    public void show(){
        System.out.println("Method Show, Class B");

    }
    public void config(){
        System.out.println("Method config, Class B");
    }
}
public class lec73 {
    public static void main(String[] args) {
        A obj1 = new A(){
            public void show(){
                System.out.println("Anonymous Show Method, Inner abstract class of A");
            }
            public void config(){
                System.out.println("Anonymous config method, Inner abstract class of A");
            }
        };
        B obj = new B();
        obj.show();
        obj1.show();
        obj1.config();
    }
}
