// More on Interfaces
interface A{
    int age = 44; // variables are final and static by default
    void show(); // they are public and abstract by default.
    void config();
}
interface Z{
    void run();
    void show();
}
interface Y extends Z{

}
class B implements A,Y{
    public void show(){
        System.out.println("Show Method, Class B implements A");

    }
    public void config(){
        System.out.println("config Method, Class B implements A");

    }
    public void run(){
        System.out.println("Method run, Class B implements Z");
    }
}
public class lec75 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.config();
        A obj2 = new B();
        obj2.show();
        obj2.config();

        // We dont need object when something is static.
        System.out.println(A.age); 
    }
}

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends