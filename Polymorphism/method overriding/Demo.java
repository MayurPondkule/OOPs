class A
{
    public void show(){
        System.out.println("showing in A");
    }

}

class B extends A{
    public void show(){
        System.out.println("showing in B");
    }
}
public class Demo {

    public static void main(String[] args) {
        
        B obj =new B();
        obj.show();
        
    }
    
}
