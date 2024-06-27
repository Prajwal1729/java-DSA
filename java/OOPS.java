class Car{
    String color;
    String type;

    public void drive(){
        System.out.println("Let's Drive!");
    }

    public void maintenance(){
        System.out.println("Under Maintenance");
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(this.name);
        // System.out.println(this.age);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+ " "+age);
    }
    // Student(String name,int age){
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("Constructor called");
    // }
    Student(Student s2){   // Copy Constructor
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }

}
public class OOPS {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Yellow";
        c1.type = "Electric Vehicle";
        c1.drive();

        Car c2 = new Car();
        c2.color = "Red";
        c2.type  = "Semi-Electric";
        c2.maintenance();

        // Student s1 = new Student("Prajwal",23);
        Student s1 = new Student();
        s1.name = "Prajwal";
        s1.age = 23;
        s1.printInfo(s1.name,s1.age);
        
    }
    
}
