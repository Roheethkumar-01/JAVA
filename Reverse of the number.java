//Reverse of the number

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    System.out.print("Enter the number to be reversed:");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rem,rev=0;
    while(n!=0){
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
    System.out.print("Reverse of the number is: "+rev);
    }
}