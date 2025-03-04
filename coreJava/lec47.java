// CONSTRUCTORS
class Lec48{
    /* 
        constructor overloading - Lecture 48
    */
    static String udemy;
}
class Human{
    private int age;
    private String name;
    //CONSTRUCTOR
    
    public Human(){
        age = 0;
        name = "";
    }
    public Human( String name, int age){
        this.age=age;
        this.name=name;
    }
    public Human(int age){
        this.age=age;
        this.name = "";
    }
    public Human(String name){
        this.age=0;
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
    public void showData(){
        System.out.println(this.name+" : "+this.age);
    }
}
public class lec47{
    public static void main(String[] args) {
        Human person = new Human();
        person.setAge(20);
        person.setName("Danish");
        person.showData();
        Human person2 = new Human("Paul Morphy",24);
        person2.showData();
        Human person3 = new Human("Alekhine");
        person3.setAge(33);
        person3.showData();
        
        Lec48.udemy="Above is lecture 47 and 48 combined in to one";
        System.out.println(Lec48.udemy);

    }
}

/* 
    contructor do not have type like int or string. it is declared as ClassName(){ then write default value}
    also write public keyword before ClassName so when we create object in different class so constructor can be called if it is private then constructor won't be called and each class have default constructor built in which we cannot see it will have default 0 or null values.
    as soon as we write our own constructor then built in constructor is no longer there and we can also have constructor overloading so we can pass value when ever we create a constructor.

*/