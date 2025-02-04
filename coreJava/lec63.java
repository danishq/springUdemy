// Upcasting and Downcasting

class Apple{
    public void show1()
    {
        System.out.println("Show1 method, Apple class");
    }
}
class Ball extends Apple{
    public void show2(){
        System.out.println("Show2 method, Ball class");
    }
}

public class lec63 {
    public static void main(String[] args) {
        // double d = 4.5;
        // System.out.println(d);
        // int i = (int)(d);
        // System.out.println(i);

        Apple obj = new Apple();
        obj.show1();

        //UPCASTING
        Apple obj1 = (Apple) new Ball();
        obj1.show1();
        
        // DOWNCASTING 
        Ball obj2 = (Ball) obj1;
        obj2.show2();
    }
}
