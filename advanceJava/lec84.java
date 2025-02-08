// Lambda Expression with return type
@FunctionalInterface
interface A{
    int add(int i, int j);

}
class lec84{
    public static void main(String[] args) {
        
        A obj = (i,j) -> i+j;
        /*
         * A obj = new A(){
         *      public int (int i, int j){
         *          return i+j; 
         *      }
         * };
         */
    }
}