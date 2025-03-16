// What is ENUM
enum Status{
    Running, Failed, Pending, Success;
}

public class lec77{
    public static void main(String[] args){
        int i=5;
        Status s = Status.Running;
        System.out.println(s.ordinal());
        Status[] st = Status.values();
        for(Status x:st){
            System.out.println(x+": "+x.ordinal());
        }
        System.out.println(i);

    }

}
