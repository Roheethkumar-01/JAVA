//Final class

final class Finaldemo{
    public void display(){
        System.out.println("Final class");
    }
}

//Final class cannot be inherited.

public class Main{
    public static void main(String[]args){
        Finaldemo f=new Finaldemo();
        f.display();
    }
}