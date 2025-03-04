//'This' keyword
class Human{
    private int age;
    private String name;
    
    //setters
    // public void setAge(int a){
    //     age=a;
    // }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }

    //getters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class lec46 {
    public static void main(String[] args) {
        // creating object of 'person' name
        Human person = new Human();
        
        //setting age and name of 'person' object using getter and setter which is encapsulation and ensuring safety of data by making class variable private and methods public
        person.setAge(25);
        person.setName("danish");
        
        // creating variable that would recieve the data that we set in above code using setters
        int x = person.getAge();
        String str = person.getName();
        
        //Printing the data of the 'person' object
        System.out.println(str+" : "+x);
         
    }
}
/*  
    in getter and setter or whenever we make a method in a user created class.
    it will know which object is calling that method in class to use  property we use "this" keyword

    this.age = age;


*/