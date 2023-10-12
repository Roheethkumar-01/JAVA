//Swapping two numbers without using temp variable

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a=s.nextInt();
		System.out.print("Enter number 2: ");
		int b=s.nextInt();
		System.out.println("Before Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}
