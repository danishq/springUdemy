// What are Methods
class Computer{
    public void sayMorning(){
        System.out.println("Good Morning!");
    }
    public String givepen(int x){
        if(x<5){
            return "not enough money";
        }
        return "pen";
    }
}
public class lec28 {
    public static void main(String[] args) {
        Computer say = new Computer();
        say.sayMorning();
        System.out.println(say.givepen(4));
    }
}
