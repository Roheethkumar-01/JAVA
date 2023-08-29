//Default Constructor

class Rectangle{
    int length,width;
    Rectangle(){
        System.out.println("Constructor called");
        length=10;
        width=20;
    }
    int area(){
        int a=length*width;
        return a;
    }
}
public class Main{
    public static void main(String[]args){
        Rectangle o=new Rectangle();
        System.out.println(o.area());
    }
}