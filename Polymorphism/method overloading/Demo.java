//method overloading-class can have multiple methods with the same name but different parameter lists. 
//In other words, you can define multiple methods in the same class with the same name, but they must
//have different types or numbers of parameters

class Calculator{
    public int add(int n1 ,int n2){
        return n1+n2;
    }

    public int add(int n1 ,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1 ,double n2,double n3){
        return n1+n2+n3;
    }
}

public class Demo{
    public static void main(String[] args) {

        Calculator obj =new Calculator();
        int ans1= obj.add(2, 3);
        int ans2= obj.add(2, 3,4);
        double ans3= obj.add(2.9, 3.3,4.4);
        System.out.println(ans1);        
        System.out.println(ans2);
        System.out.println(ans3);

        
    }
}