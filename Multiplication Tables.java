//Multiplication Tables

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the tables :");
		int t=s.nextInt();
		System.out.print("Enter the limit :");
		int n=s.nextInt();
		for(int i=0;i<=n;i++){
		    System.out.println(t+"x"+i+"="+(t*i));
		}
	}
}