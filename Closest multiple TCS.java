//Closest multiple for x to y
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
		int x=sc.nextInt();
		System.out.print("Enter the second number: ");
		int y=sc.nextInt();
		int lower=(x/y)*y;
		int upper=lower+y;
		int close=0;
		if((x-lower)<(x-upper)){
		    close=lower;
		}
		else{
		    close=upper;
		}
		System.out.println("Closest Multiple: "+close);
	}
}