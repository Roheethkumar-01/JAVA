//Maximum element

import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the array size: ");
	    int lim=s.nextInt();
	    int i;
	    int arr[]=new int[lim];
	    for(i=0;i<=lim-1;i++){
	        System.out.print("Enter "+i+" element: ");
	        arr[i]=s.nextInt();
	    }
	    System.out.println(Arrays.toString(arr));
		int max=0;
		for(i=0;i<lim-1;i++){
		    max=arr[i];
		    if(max<arr[i+1]){
		        max=arr[i+1];
		    }
		}
		System.out.println(max);
	}
}
