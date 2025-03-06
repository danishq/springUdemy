enum Status{
    Running, Failed, Pending, Success;
}

public class lec78{
    public static void main(String[] args){
        int i=5;
        Status s = Status.Running;
        System.out.println(s.ordinal());
        Status[] st = Status.values();
        for(Status x:st){
            System.out.println(x+": "+x.ordinal());
        }
        Status sts = Status.Pending;
        if(sts == Status.Running)
        { System.out.println("All good");}
        else if(sts == Status.Failed )
        { System.out.println("Try again");}
        else if(sts == Status.Pending)
        { System.out.println("Please Wait");}
        else{ System.out.println("Done");}
    
    } 

}