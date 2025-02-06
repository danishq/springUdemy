class Calculator{
    public int add(int num1, int num2){
        // System.out.println("in add");
        return num1+num2;
    }
}
public class lec26{
    public static void main(String args[]){
        // int[] arr1 = {1,2,3,4};

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 5;
        arr[3] = 5;
        arr[4] = 5;
        int num1 = 4;
        int num2 = 5;
        System.out.println("hello");
        // int result = num1 + num2;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);

        int arr1[] = new int[2];
        arr1[0]=1;
        arr1[1]=2;
        for(int x:arr1){
            System.out.println(x);
        }
    }
}


