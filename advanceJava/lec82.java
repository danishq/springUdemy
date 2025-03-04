// Functional Interface New
@FunctionalInterface
interface A{
    void show();

}
class B implements A{
    public void show(){
        System.out.println("Method Shoe, Class B, Implement A");
    }
}
interface C{
    void show();
    void run();
}
class lec82{
    public static void main(String[] args) {
       A obj = new B();
       obj.show(); 
    }
}
