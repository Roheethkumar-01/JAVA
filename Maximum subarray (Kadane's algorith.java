//Maximum subarray (Kadane's algorithm) and also that array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of the array: ");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        System.out.print("Enter "+i+" Element: ");
	        arr[i]=sc.nextInt();
	    }
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int start=0,end=0,tempStart=0;
        for(int i=0;i<arr.length;i++){
           int a=arr[i]+curSum;
          if(curSum<0){
              tempStart=i+1;
          }
           if(a<arr[i]){
               curSum=arr[i];
           } 
           else{
               curSum=a;
           }
           if(maxSum<curSum){
               maxSum=curSum;
               start=tempStart;
               end=i;
           }
        }
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Maximum value: "+maxSum);
    }
}