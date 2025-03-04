// Need of Interface
// class Computer{
//     public void code(){

//     }
// }

// this is exactly where abstract will come in need or we can also use interface here 

// abstract class Computer(){
//     public abstract void code();
// }

interface Computer{
    void code();
}
class Laptop implements  Computer{
    public void code(){
        System.out.println("code, compile, Run");

    }
}
class Desktop implements  Computer{
    public void code(){
        System.out.println("code, compile, Run, Faster");
    }
}
class Developer {
    public void devApp(Computer L1){
        L1.code();
        // System.out.println("Developing...");

    }
}
public class lec76 {
    public static void main(String[] args) {
        Developer xyz = new Developer();
        Computer L1 = new Laptop();
        Computer desk = new Desktop();
        xyz.devApp(desk);
    }
         
}

