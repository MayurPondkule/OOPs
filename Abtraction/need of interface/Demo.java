interface  Computer{
    public abstract void code();
}


class Laptop implements Computer{
    public void code(){
        System.out.println("code , compile , run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code , compile , run: faster");
    }
}

class Dev{
    public void devApp(Computer x){
        x.code();;
    }
}



public class Demo{
    public static void main(String[] args) {

       
        Computer lap=new Laptop();
        Computer desk=new Desktop();

         Dev mayur=new Dev();

        mayur.devApp(lap);
        mayur.devApp(desk);


        
    }
}