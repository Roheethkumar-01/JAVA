//Gcd using recursion

import java.util.*;
class recursion{
    void rec(int a,int b){
        if(b==0){
            System.out.print("Gcd is "+a);
        }
        else{
            rec(b,a%b);
        }
    }
}
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num=s.nextInt();
        System.out.print("Enter the second number: ");
        int num1=s.nextInt();
        recursion r=new recursion();
        r.rec(num,num1);
    }
}