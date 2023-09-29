//Checking odd or even without modulus operator

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=s.nextInt();
		int org=num;
		while(num>1){
		    num=num-2;
		}
		if(num==1){
		    System.out.println(org+" is Odd");
		}
		else{
		    System.out.println(org+" is Even");
		}
	}
}
