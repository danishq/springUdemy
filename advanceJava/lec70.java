abstract class Car{
    
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println("driving...");
    }
}
public class lec70 {
    public static void main(String[] args) {
        WagonR obj = new WagonR();
        Car obj2 = new WagonR(); // dynamic method dispatch is possible
        obj.drive();
        obj.playMusic();
    }
}
