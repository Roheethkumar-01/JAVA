//Search element for non repeated elements

import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int lim=s.nextInt();
		int i,j,k;
		int arr[]=new int[lim];
		for(i=0;i<lim;i++){
		    System.out.print("Enter "+i+" Element: ");
		    arr[i]=s.nextInt();
		}
		System.out.print("Enter the element to  be searched: ");
		int sea=s.nextInt();
		for(j=0;j<=lim-1;j++){
		    for(k=j+1;k<=lim-1;k++){
		        if(arr[j]==sea){
		            System.out.print("The searched element is in "+j+" index");
		        }
		    }
		}
	}
}
