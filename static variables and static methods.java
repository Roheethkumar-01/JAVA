//static variables and static methods

class Statictest{
    static int a=10;//Static value is assigned
    int b=20;//instance value
    void show(){
        System.out.println("A:"+a+" B:"+b);
    }
    static void display(){
        System.out.println("A: "+a);
    }
}
public class Main{
    public static void main(String[]args){
        Statictest s=new Statictest();
        s.show();
        Statictest s1=new Statictest();
        s1.b=200;
        s1.show();
        Statictest.a=200;//static can only be changed entirely
        s1.show();
        s.show();
        
    }
}