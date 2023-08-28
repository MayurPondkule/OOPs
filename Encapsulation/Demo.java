// Encapsulation-
// concept of bundling data (attributes) and methods (functions) that operate on that data into a single unit,
// called a class.. The key idea behind encapsulation is to hide the internal details of how an object works and
// provide a well-defined interface for interacting with it. 
// encapsulation is implemented through the use of access modifiers and getter and setter methods.
// Access modifiers control the visibility of class members (attributes and methods) from outside the class.


class Human{
    private int age=11;
    private String name="mayur";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name ;
    }

    public void setAge(int a){
        age=a;
    }
    
    public void setName(String n){
        name=n;
    }


}
public class Demo{
    public static void main(String[] args) {

        Human obj=new Human();

        obj.setAge(22);
        obj.setName("mayi");

        System.out.println(obj.getAge()+" "+obj.getName());
        
    }
}