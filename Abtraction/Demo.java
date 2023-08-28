//creating abstract classes and interfaces to define a blueprint for other classes

abstract class Car{
    public abstract void drive();

    public void music(){
        System.out.println("playing");
    } 
}

class BMW extends Car{
    public void drive(){
        System.out.println("driving");
    }
}

public class Demo {

    public static void main(String[] args) {

        Car obj=new BMW();
        obj.drive();
        obj.music();
        
    }
}
