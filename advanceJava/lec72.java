class A{
    public void show(){
        System.out.println("Method show, Class A");

    }
}
class B extends A{
    public void show(){
        System.out.println("Method show, Class B");

    }
}
public class lec72 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();


        // Anonymous class and this is because if i want to override the show method instead of making a new class then extending to A. I can simply do this which is very efficient.
        A obj2 = new A(){
            public void show(){
                System.out.println("show Method, Class Anonymous");

            }
        };
        obj2.show();
    }
}

/*

*/