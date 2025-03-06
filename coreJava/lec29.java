//Method Overloading

class Calc{
    public int add(int x, int y)
    {
        return x+y ;
    }
    public int add(int x, int y, int z){
        return x+y+x;
    }
}
public class lec29{
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result = obj.add(5,4);
        System.out.println(result);
    }
}
