// Abstract and Anonymous Inner Class
abstract class A{
    public abstract void show();
}
class B extends A{
    public void show(){
        System.out.println("Method Show, Class B");

    }
}
public class lec73 {
    public static void main(String[] args) {
        A obj1 = new A(){
            public void show(){
                System.out.println("Anonymous Show Method, A abstract class");
            }
        };
        B obj = new B();
        obj.show();
        obj1.show();
    }
}
