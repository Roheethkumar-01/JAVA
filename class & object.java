//class & object

import java.util.Scanner;
class Rectangle{
    int length,width;
    void getdetails(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        int a=length*width;
        return a;
    }
}

public class Main
{
	public static void main(String[] args) {
		Rectangle o=new Rectangle();
		o.getdetails(100,100);
		System.out.println(o.area());
		Rectangle o2=new Rectangle();
		o2.length=10;
		o2.width=10;
		System.out.print(o2.area());
	}
}
