// Encapsulation
class Human{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public void setName(String s){
        name = s;
    }
}
public class lec44 {
    public static void main(String[] args) {
       Human person = new Human();
        //    person.age=25;
        //    person.name = "danish"; 
        person.setAge(25);
        person.setName("danish");
        int x = person.getAge();
        String str = person.getName();
        System.out.println(str+" : "+x);
    }
}


/* 
    controlling which data should be accessible and which data we want to hide from user.
    Private : access modifier
    use private modifier
    then we can't use that variable in other class. private is also done in class
    we can allow it still to access only if the programmer decide to share using getter and setters.
    Here we are encapsulating data and methods. and this is encapsulation
*/