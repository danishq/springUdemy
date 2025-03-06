// Lambda Expression with return type
@FunctionalInterface
interface A{
    int add(int i, int j);

}
// Lambda expression only works with functional interfaces because in line 11 (i,j) will belong to only one function but if we have more than one function there is no way of knowing which fucntion to call.

class lec84{
    public static void main(String[] args) {
        
        A obj = (i,j) -> i+j;
        /*
         * A obj = new A(){
         *      public int (int i, int j){
         *          return i+j; 
         *          } 
         * };
         */
    }
}