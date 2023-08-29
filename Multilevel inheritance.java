//Multilevel inheritance

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
class wife extends Son{
    public void bike(){
        System.out.println("Pulsar");
    }
}
public class Main{
    public static void main(String[]args){
        wife w=new wife();
        w.bike();
        w.car();
        w.house();
        Son s=new Son();
        s.house();
        Father f=new Father();
        f.house();
    }
}