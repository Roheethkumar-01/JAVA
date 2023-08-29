//Abstract class

import java.util.*;
abstract class mobile{
    abstract void camera();
    abstract void display();
    void voicecall(){
        System.out.println("can do voice call");
    }    
}
class samsung extends mobile{
    public void camera(){
        System.out.println("Samsung camera");
    }
    public void display(){
        System.out.println("Samsung display");
    }
}
class nokia extends mobile{
    public void camera(){
        System.out.println("Nokia camera");
    }
    public void display(){
        System.out.println("Nokia display");
    }
    void finger(){
        System.out.println("Finger");
    }
}
public class Main{
    public static void main(String[]args){
        nokia n=new nokia();
        n.camera();
        n.display();
        n.finger();
        n.voicecall();
        
        samsung s=new samsung();
        s.camera();
        s.display();
        s.voicecall();
    }
}