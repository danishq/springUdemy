enum Laptop{
    Running, Failed, Pending, Success;
}

public class lec79{
    public static void main(String[] args){
        int i=5;
        Laptop s = Laptop.Running;
        System.out.println(s.getClass().getSuperclass());
        System.out.println(s.ordinal());
        Laptop[] st = Laptop.values();
        for(Laptop x:st){
            System.out.println(x+": "+x.ordinal());
        }
        Laptop sts = Laptop.Pending;
        if(sts == Laptop.Running)
        { System.out.println("All good");}
        else if(sts == Laptop.Failed )
        { System.out.println("Try again");}
        else if(sts == Laptop.Pending)
        { System.out.println("Please Wait");}
        else{ System.out.println("Done");}
    
    } 

}