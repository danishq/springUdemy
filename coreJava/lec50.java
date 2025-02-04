// Anonymous Object

class A{
    public A(){
        System.out.println("Contructor, Object created");
    }
    public void show(){
        System.out.println("Class A, Show Method");
    }
}

public class lec50 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A obj1;
        obj1 = new A();
        obj1.show();

        new A().show();
        new A().show();

    }
}
/* 
    OUTPUT:
    Contructor, Object created
    Class A, Show Method
    Contructor, Object created
    Class A, Show Method
    Contructor, Object created
    Class A, Show Method
    Contructor, Object created
    Class A, Show Method
*/