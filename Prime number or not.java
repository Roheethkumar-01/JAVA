//Prime number or not

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=s.nextInt();
		int f=0;
		for(int i=1;i<=num;i++){
		     if(num%i==0){
		         f++;
		     }
		}
		if(f==2){
		    System.out.println(num+" is a prime number");
		}
		else{
		    System.out.println(num+" is not the prime number");
		}
	}
}