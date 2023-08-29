//Constructor overloading and parameterized Constructor

class Box{
    int length,width;
    //default
    Box(){
        length=2;
        width=3;
    }
    //single parameter
    Box(int x){
        length=width=x;
    }
    //Two parameters
    Box(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        return length*width;
    }
}
public class Main{
    public static void main(String[]args){
        Box o=new Box();
        System.out.println(o.area());
        Box o1=new Box(6);
        System.out.println(o1.area());
        Box o2=new Box(6,9);
        System.out.println(o2.area());
    }
}