class A{

    int age;
    public void show(){
        System.out.println("Method Show");
    }

    class B{
        public void config(){
            System.out.println("in Config");

        }
    }

    // static class B{
    //     public void config(){
    //         System.out.println("in Config");

    //     }
    // }
}

class lec71{
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        A.B obj2 = obj1.new B();
        obj2.config();

    }
}


/* 
    You can do make inner class a Static Inner class 
    ex:
    static class B{
        public void config(){
            System.out.println("Config Method");
        }
    }
    
    And this is how you will create an object of this class in main function:
    ex:
    A.B obj = new A.B();
    obj.config();
*/