// String Buffer and String Builder
public class lec40 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        String str = sb.toString();
        System.out.println(str);
        sb.deleteCharAt(0);
        sb.insert(6, "java");

        //Also look at other methods of StringBuffer and String
        
    }
}
