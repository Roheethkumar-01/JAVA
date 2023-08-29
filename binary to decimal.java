//binary to decimal

import java.util.Scanner;
public class Main{
    public static int b2d(int n){
        int decimal=0,power=0;
        while(n!=0){
            int rem=n%10;
            decimal+=rem*Math.pow(2,power);
            n=n/10;
            power++;
        }
        return decimal;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int num=s.nextInt();
        System.out.print("The decimal number is: ");
        System.out.println(b2d(num));
    }
}