// abstract class Animal{
//     Animal(){
//         System.out.println("You are creating a new animal");
//     }
//     abstract public void walk();
//     public void eats(){
//         System.out.println("Animal eats");
//     }
// }

interface Animal{
    int eyes = 2;
    void walk();
 
}

interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Penguin implements Animal{
    Penguin(){
        System.out.println("Penguin Created");
    }
    public void walk(){
        System.out.println("walks on 2 legs");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();


    // It will face the runtime error because the class is just a blueprint which can be imagine only.
        // Animal a1 = new Animal();
        // a1.walk();
        
    }
    
}
