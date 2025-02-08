enum Laptop{
    Macbook(2000), Dell(2200), HP(500), Asus(700);  
    private int price;

    private Laptop(int price) {
        this.price=price;
    }

     public int getPrice(){
        return price;
     }
     public void setPrice(int price){
        this.price = price;
     }
}

public class lec79{
    public static void main(String[] args){
        int i=5;
        Laptop s = Laptop.Asus;
        System.out.println(s.getClass().getSuperclass());
        System.out.println(s.ordinal());
        Laptop[] st = Laptop.values();
        for(Laptop x:st){
            System.out.println(x+": "+x.ordinal());
        }
        Laptop sts = Laptop.HP;
        if(sts == Laptop.Macbook)
        { System.out.println("All good");}
        else if(sts == Laptop.Dell)
        { System.out.println("Try again");}
        else if(sts == Laptop.HP)
        { System.out.println("Please Wait");}
        else{ System.out.println("Done");}
    
        //System.out.println(Laptop.Macbook.getPrice());
        for(Laptop x:Laptop.values()){
            System.out.println(x+" "+x.getPrice());
        }
    } 

}