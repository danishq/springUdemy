/* Method Overriding */

class Apple{
    public void show(){
        System.out.print("obj.show(); : ");
        System.out.println("show method, Apple Class");

    }
    public void config(){
        System.out.print("obj.config(); : ");
        System.out.println("config method, Apple class");

    }
}
class Ball extends Apple{
    public void show1(){
        System.out.print("obj.show1(); : ");
        System.out.println("show1 method, Ball Class");
    }
    @Override 
    public void show(){
        System.out.print("obj.show(); : ");
        System.out.println("show method, Ball Class");
    }
    public void show(String str){
        if("super".equals(str)){
            super.show();
        }
    }
}
public class lec56 {
    public static void main(String[] args) {
        Ball obj = new Ball();
        obj.show1();
        obj.config();
        obj.show();
        obj.show("super");
        obj.show();
        obj.show("super");
        obj.show("super");
        
    }
}
