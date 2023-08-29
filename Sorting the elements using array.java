//Sorting the elements using array

import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[]{0,4,2,6,1,9};
	    System.out.println("Before Sort:"+Arrays.toString(arr));
	    int temp,i,j;
	    for(i=0;i<arr.length;i++){
	        for(j=i+1;j<arr.length;j++){
	            if(arr[i]>arr[j]){
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    System.out.print("After Sort:"+Arrays.toString(arr));
	}
}

//Sorting the elements in the array from input given by user
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.print("Enter the size of the array:");
	   int lim=s.nextInt();
	   int i,j,temp;
	   int arr[]=new int[lim];
	   for(i=0;i<lim;i++){
	       System.out.print("Enter "+i+ " Element: ");
	       arr[i]=s.nextInt();
	   }
	   System.out.println("Before Sort: "+Arrays.toString(arr));
	   for(i=0;i<lim;i++){
	       for(j=i+1;j<lim;j++){
	           if(arr[i]>arr[j]){
	               temp=arr[i];
	               arr[i]=arr[j];
	               arr[j]=temp;
	           }
	       }
	   }
	   System.out.println("After Sort: "+Arrays.toString(arr));
	}
}

//Print duplicate elements in an Arrays

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
	   System.out.println("Array elements : "+Arrays.toString(arr));
       for(i=0;i<lim-1;i++){
           for(j=i+1;j<lim;j++){
               if(arr[i]==arr[j] && i!=j){
                   System.out.print(arr[i]);
               }
           }
       }	   
	}
}


