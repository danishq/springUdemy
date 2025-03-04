// jagged array and 3d array
public class lec34 {
    public static void main(String[] args) {
        int num[][] = new int[3][]; //jagged array
        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[5];
        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j] = (int)(Math.random()*100)/10;
            }
        }

        for(int[] x:num){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();

        }
        //3d Array
        int num3d[][][] = new int [3][3][3];
        num3d[0][0][0]=1;
        

    }
}
