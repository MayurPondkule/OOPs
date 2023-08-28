
class Human{
    private int age=33;
    private String name="rahul";

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //goto source action -> generate getter setter 
    
}


public class Demo2 {
    public static void main(String[] args) {
        Human obj=new Human();

        System.out.println(obj.getAge()+" "+obj.getName());
        
    }
}
