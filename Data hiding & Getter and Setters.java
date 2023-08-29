//Data hiding & Getter and Setters in java

class Shaperect{
    int length,width;
    //Setter Methods
    void setLength(int l){
        length=l;
    }
    void setWidth(int w){
        width=w;
    }
    //Getter methods
    int getLength(){
        return length; 
    }
    int getWidth(){
        return width;
    }
    int area(){
        int a=length*width;
        return a;
    }
}
public class Main{
    public static void main(String[]args){
        Shaperect o=new Shaperect();
        o.setLength(10);
        o.setWidth(20);
        System.out.println(o.getLength());
        System.out.println(o.getWidth());
        System.out.print(o.area());
    }
}