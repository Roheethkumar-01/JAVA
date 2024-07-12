//Given an array Arr[ ] of N integers and a positive integer K. The task is to
//cyclically rotate the array clockwise by K
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the value to be rotated in clockwise: ");
		int rot=sc.nextInt();
		int totrot=size-rot;
		int arr1[]=new int[size];
		for(int i=0;i<size;i++){
		    int ind=(totrot++)%size;
		    arr1[i]=arr[ind];
		    
		}
		System.out.println(Arrays.toString(arr1));
	}
}