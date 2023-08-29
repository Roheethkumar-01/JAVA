//First n odd and even numbers

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=s.nextInt();
    int odd=0;
    int even=0;
    System.out.print("The first "+n+ "odd numberes are:\n");
    for(int i=1;i<=n;i++){
        odd=(2*i)-1;
        System.out.println(odd);
    }
    System.out.println("");
    System.out.print("The first "+n+ "even numberes are:\n");
    for(int i=1;i<=n;i++){
        even=2*i;
        System.out.println(even);
    }
    }
}