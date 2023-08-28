class Cal{

    public int add(int a,int b){
        return a+b;
    }

    
}

class AdCal extends Cal {
    public int add(int a,int b){
        return a+b+1;
    }
}

public class Calculator {
    public static void main(String[] args) {

        AdCal obj=new AdCal();
        int ans =obj.add(2,3);
        System.out.println(ans);

        
    }
    
}
