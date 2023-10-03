//Triplet 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.print("Enter the array size: ");
		int lim=s.nextInt();
		int[] arr=new int[lim];
		for(int i=0;i<lim;i++){
		    System.out.print("Enter "+i+" th element: ");
		    arr[i]=s.nextInt();
		}
		for(int i=0;i<lim;i++){
		    for(int j=i+1;j<lim;j++){
		        for(int k=j+1;k<lim;k++){
		            if(arr[i]+arr[j]+arr[k]==0){
		                flag=1;
		                System.out.println("Triplet is: "+arr[j]+" "+arr[i]+" "+arr[k]);
		            }
		        }
		    }
	     }
	     if(flag==0){
	         System.out.println("No Triplet found");
	     }
	}
}
