//Method overloading(Compile time polymorphism)

import java.util.Scanner;
class com{
    public static int multiply(int x,int y){
        return x*y;
    }
    public static double multiply(double l,double i){
        return l*i;
    }
    public static double multiply(double n,int m){
        return n*m;
    }
    public static int multiply(int o){
        return o*o;
    }
}
public class Main{
    public static void main(String[]args){
        com obj=new com();
        System.out.println(obj.multiply(2,3));
        System.out.println(obj.multiply(2.4,3.4));
        System.out.println(obj.multiply(2.4,3));
        System.out.println(obj.multiply(2));
    }
}