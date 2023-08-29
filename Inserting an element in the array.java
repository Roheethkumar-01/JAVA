//Inserting an element in the array 

import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.print("Enter the size of the array:");
	   int lim=s.nextInt();
	   int i,j,temp,index,value;
	   int arr[]=new int[lim];
	   for(i=0;i<lim;i++){
	       System.out.print("Enter "+i+ " Element: ");
	       arr[i]=s.nextInt();
	   }
	   System.out.println("Before inserting: "+Arrays.toString(arr));
	   System.out.print("Enter the index on which value to be inserted: ");
	   index=s.nextInt();
	   System.out.print("Enter the value to be inserted: ");
	   value=s.nextInt();
	   for(i=lim-1;i>index;i--){
	       arr[i]=arr[i-1];
	   }
	   arr[index]=value;
	   System.out.println("After inserting: "+Arrays.toString(arr));
	}
}
