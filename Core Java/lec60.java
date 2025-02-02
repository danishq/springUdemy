//Dynamic Method Dispatch
class Apple{
    
    public void show(){
        System.out.println("Show Method, Class Apple");

    }
}
class Ball extends Apple{
    public void play(){
        System.out.println("playing Ball");
    }
    public void show(){
        System.out.println("Show Method, Class Ball");

    }
}
class Cat extends Apple{
    public void show(){
        System.out.println("Show Method, Class Cat");
    }
}
public class lec60 {
    public static void main(String[] args) {
       Apple obj = new Apple();
       obj.show();
       obj = new Ball();
       obj.show();
       obj = new Cat();
       obj.show();
    }
}

/* 
    ParentClass object = new ChildClass();
    This is called dynamic method dipatch
    also runtime polymorphism
*/





