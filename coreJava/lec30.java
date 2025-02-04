// Stack and Heap
class Calc{
    int num=5;
    public int add(int x, int y){
        return x+y ;
    }
    
    public int add(int x, int y, int z){
        System.out.println(num);
        return x+y+z;
    }

}
public class lec30 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        Calc obj1 = new Calc();
        // int result = obj.add(5,4);
        System.out.println(obj1.num);
        System.out.println(obj.num);
        obj1.num=8;
        System.out.println(obj1.num);
        System.out.println(obj.num);
    }
}