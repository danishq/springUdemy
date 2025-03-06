// Final Keyword
final class Calc{
    public void show(){
        System.out.println("Calc Class, Show method");

    }
    public void add(int n, int m){
        System.out.println(n+m);
    }
}

public class lec61 {
    public static void main(String[] args) {
        int num=0;
        num=8;
        System.out.println(num);

        // final int y=0;
        // y=5;
        // System.out.println(y);




    }
}
/*
    final - variable, class, method
    final int x= 0 -> cannot change final value
    final class demo {} -> cannot extend class. Inheritance is stopped
    final public void show(){} -> stops method overriding
*/