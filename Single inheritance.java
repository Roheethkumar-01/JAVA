//Single inheritance

import java.util.Scanner;
class Father{//Base class
    public void house(){
        System.out.println("2BHk");
    }
}
class Son extends Father{//Derived class
    public void car(){
        System.out.println("benz");
    }
}
public class Main{
    public static void main(String[]args){
        Son s=new Son();
        s.car();
        s.house();
    }
}