public class lec51 {
    public static void main(String[] args) {
        /*  Advance machine = new Advance();   This is an example of inheritance and VeryAdv is multilevel inheritance. */
        VeryAdv machine = new VeryAdv();
        int r1 = machine.multi(15, 2);
        int r2 = machine.add(10, 10);
        int r3 = machine.sub(50, 20);
        int r4 = machine.div(100,4);
        double r5 = machine.power(4,2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);


    }
}





/* 

In folder lecture51 which is about inheritance. there are three files called lec51, calc, and advance(advance calculator)




*/