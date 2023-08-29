//copy constructor
 
import java.util.Scanner;
class complex{
    int real,img;
    complex(){
        this.real=5;
        this.img=2;
    }
    complex(int x,int y){
        this.real=x;
        this.img=y;
    }
    complex(complex o2){
        this.real=o2.real;
        this.img=o2.img;
    }
    public String toString(){
        return("("+real+"+"+img+"i)");
    }
}

public class Main
{
	public static void main(String[] args) {
		complex o1=new complex();
		complex o2=new complex(3,5);
		complex o3=new complex(o2);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
}
