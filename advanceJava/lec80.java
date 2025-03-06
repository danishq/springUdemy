//What is Anotation Its a MetaData
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("class A");
    }
    public void show(){
        System.out.println("Method Show, Class A");
    }
}
class B extends A{
    /*
    @Override
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("Class B");
    }
    This will give error because of subtle spelling change in method name and @Override will catch that mistake and let developer know. This is called anotation.
    */
    public void show(){
        super.show();
        System.out.println("Method Show Class B child of A");

        
    }

}
class lec80{
    public static void main(String[] args) {
       B obj =new B();
       obj.show();
       A obj1 = new A();
       obj1.showTheDataWhichBelongsToThisClass();
        
    }
}
