// import bank.Bank;
class Shape{
    String color;
    public void Area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void Area(int l,int h){
        System.out.println(0.5*l*h);
    }
     
}

class EquilateralTriangle extends Triangle{
    public void Area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape{
    public void Area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Green";

        // bank.Account a1 = new bank.Account();
        // a1.name = "Customer";
    }
    
}
