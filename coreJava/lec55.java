/* This and Super Methods */
class Apple extends Object{
    Apple(){
        super();
        System.out.println("Apple Constructor");
    }
    Apple(int n){
        super();
        System.out.println("Apple Constructor int type");
    }
}
class Ball extends Apple{
    public Ball(){
        // super(5);
        super();
        System.out.println("Ball Constructor");
    }
    public Ball(int n){
        super(n);
        System.out.println("Ball Constructor int type");
    }
    public Ball(String str){
        // this(5);
        this();
        /* OUTPUT:
           Apple Constructor int type
            Ball Constructor int type
            Ball Constructor String type Message
        */
        System.out.println("Ball Constructor String type" + str);
    }
}
public class lec55 {
    public static void main(String[] args) {
        Ball obj = new Ball(5);
        System.out.println();
        Ball obj2 = new Ball();
        System.out.println();
        Ball obj3 = new Ball(" Message");

        


    }
}
/* 
    OUTPUT:
    if second constuctor of Ball do not have super
    Apple Constructor
    Ball Constructor int type

    if second constructor of Ball have super(n);
    then:
    Apple Constructor int type
    Ball Constructor int type

    Every constructor in java has a method in it even if its not mentioned. the name of method is
    super();

    even main class also have constructor for example:
    
            public class MainClass {
                private String message;

                // Constructor
                public MainClass(String message) {
                    this.message = message;
                }

                public void printMessage() {
                    System.out.println(message);
                }

                // main method
                public static void main(String[] args) {
                    MainClass obj = new MainClass("Hello, World!");
                    obj.printMessage();  // Output: Hello, World!
                }
            }


    ans also super method "super();"

    this(); will execute the constructor of same class
    this(); and super(); must be the first line of code in any constructor therefore we cannot use this and super at the same time;
*/