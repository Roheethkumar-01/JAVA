//Nesting of methods

import java.util.Scanner;
class demo{
    int m,n;
    demo(int x,int y){
        m=x;
        n=y;
    }
    int largest(){
        if(m>n)
            return m;
        else
            return n;
    }
    void display(){
        int large=largest();
        System.out.println("The largest number is: "+large);
    }
}
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=s.nextInt();
        System.out.print("Enter the second number: ");
        int num2=s.nextInt();
        demo d=new demo(num1,num2);
        d.display();
        
    }
}