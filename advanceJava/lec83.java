// Lambda Expression
@FunctionalInterface
interface A{
    void show();
}
class lec83{
    public static void main(String[] args) {
        A obj = () ->  System.out.println("Show method in anonymous object"); 
        obj.show();
    }
}