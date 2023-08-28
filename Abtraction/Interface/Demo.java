//An interface in Java is a reference type that is similar to a class. It is a collection of abstract methods
//that any concrete (non-abstract) class implementing the interface must provide. Interfaces provide a way to 
//achieve multiple inheritance in Java and define a contract that classes must adhere to.

interface A{ 


    int num=9;             //final and static 
    String name="mayur";

    void show();     //by default it is public abstract
    void show2();


}
interface X{ 

   void hi();    

} 

interface Y extends X{
    void bye();
}

// class-class => extends
// class - interface  => implements
// interface — interface => extends

class B implements A,X,Y {    //in abstract can't extends 2 abtract class but in interface it possible
    
    public void show(){
        System.out.println("showing");

    }
    public void show2(){
        System.out.println("showing 2");

    }
     public void hi(){
        System.out.println("hiii");

    }

    public void bye(){
        System.out.println("byee");
    }
    

}


public class Demo{
    public static void main(String[] args) {

        A obj=new B();
        obj.show();
        obj.show2();

        Y obj1=new B();
        obj1.hi();
        obj1.bye();

               
        System.out.println(A.num);
        System.out.println(A.name);

        

        
    }
}
