//Hierarchical inheritance

class shape{
    float length,breadth,radius;
}
class rect extends shape{
    public rect(float x,float y){
        length=x;
        breadth=y;
    }
    float rect_area(){
        return length*breadth;
    }
}
class circle extends shape{
    public circle(float r){
        radius=r;
    }
    float circle_area(){
        return (radius*radius);
    }
}
class square extends shape{
    public square(float a){
        length=a;
    }
    float square_area(){
        return (length*length);
    }
}
public class Main{
    public static void main(String[]args){
        rect b=new rect(2,2);
        System.out.println("Area of rectagle: "+b.rect_area());
        circle c=new circle(4);
        System.out.println("Area of circle: "+c.circle_area());
        square s=new square(5);
        System.out.println("Area of square: "+s.square_area());
    }
}