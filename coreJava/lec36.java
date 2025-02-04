
//Array of Objects and Enhanced for loop (for each loop)
class Student{
    int roll;
    String name;
    int marks;
}
public class lec36 {
    public static void main(String[] args) {
        int num[] = new int[6];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        for(int x:num){
            System.out.print(x+" ");
        }
        System.out.println();

        Student s1 = new Student();
        s1.name="pranav";
        s1.roll=14;
        s1.marks=95;
        
        Student s2 = new Student();
        s2.name="Mohit";
        s2.roll=55;
        s2.marks=96;

        Student s3 = new Student();
        s3.name = "Raju";
        s3.roll = 42;
        s3.marks = 98;

        Student[] student_list = new Student[3];
        student_list[0]=s1;
        student_list[1]=s2;
        student_list[2]=s3;
        System.out.println(student_list[0].name+" "+student_list[0].roll+" "+student_list[0].marks);

        //This is enhanced for loop or also called for each loop
        for(Student x:student_list){
            System.out.println(x.name+" "+x.roll+" "+x.marks);
        }
    }
    
}
