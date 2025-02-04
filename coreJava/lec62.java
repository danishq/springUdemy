// Object Class equals tostring hashcode
class Laptop{
    protected String model;
    protected int price;
    public String toString(){
        return model + "->" + price;
    }
    boolean equals(Laptop obj){
        if(this.model == obj.model && this.price == obj.price){
            return true;
        }
        return false;
    }
}
public class lec62 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model="lenovo";
        obj1.price=1500;
        // System.out.println(obj1.model+" : "+obj1.price);   
        System.out.println(obj1);
        // System.out.println(obj1.toString());
        Laptop obj2 = new Laptop();
        obj2.model="lenovo";
        obj2.price=1500;
        System.out.println(obj2);

        boolean result = obj1.equals(obj2);
        System.out.println(result);
        
    }
}

/*
    vs code gives equals and to string and hashcode already 
    right click and select get actions and select method you want vs code to create.
    
*/
