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
public class lec45 {
    public static void main(String[] args) {
       Human person = new Human();
        person.setAge(25);
        person.setName("danish");
        int x = person.getAge();
        String str = person.getName();
        System.out.println(str+" : "+x);
        
    }
}
/*
    getname, getage and setage, setname are getters and setters.
    vs code has this built in functionality to make getters and setters.
    
*/