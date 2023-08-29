//Total number of odd and even numbers in the array

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int n=s.nextInt();
		int []arr=new int[n];
		int even=0,odd=0;
		for(int i=0;i<arr.length;i++){
		    System.out.print("Enter a["+i+"] value: ");
		    arr[i]=s.nextInt();
		}
		for(int element:arr){
		    if(element%2==0){
		        even++;
		    }
		    else{
		        odd++;
		    }
		}
		System.out.println("Total odd numbers:"+odd);
		System.out.print("Total even numbers:"+even);
	}
}
