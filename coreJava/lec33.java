public class lec33 {
    public static void main(String[] args) {
        int num[][] = {{1,2,3},{5,6,7},{7,8,9}};
        // int[] num and int num[] are both correct in java however int[] num is more common
        for(int[] x:num){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
