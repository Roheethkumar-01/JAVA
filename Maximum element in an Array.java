//Maximum element in an Array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int num=s.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
		    System.out.print("Enter "+i+"th element: ");
		    arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
		    if(max<arr[i]){
		        max=arr[i];
		    }
		}
		System.out.println("The maximum element is: "+max);
	}
}
