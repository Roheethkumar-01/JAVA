//SUbtract two numbers without using - operator

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a=s.nextInt();
		System.out.print("Enter number 2: ");
		int b=s.nextInt();
		System.out.print("The value is: "+(a+(~b)+1));
	}
}
