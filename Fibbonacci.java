//Fibbonacci series

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=s.nextInt();
    int a=-1,b=1,c;
    
    for(int i=1;i<=n;i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
    }
}