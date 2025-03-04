//mutable vs immutable string
public class lec39{
    public static void main(String[] args) {
        String name = "navin";
        name = name + " reddy";
        System.out.println(name);
        String s1="hello";
        String s2="hello";
        if(s1.hashCode()==s2.hashCode()){
            System.out.println(true);
        }
    }
}