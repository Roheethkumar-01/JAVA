//TCS NQT coding 2 - Monkey jumps
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Monkey Rope Jumping");
		int n,h,k,i,count=0;
		System.out.print("Enter the No.of Ropes:");
		n=s.nextInt();
		System.out.print("Enter the height which can monkey jump:");
		h=s.nextInt();
		System.out.print("Enter the sliding range:");
		k=s.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++){
		    System.out.print("Enter "+i+"th rope height:");
		    arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
		    while(arr[i]>0){
		        count++;
		        arr[i]=arr[i]-h;
		        if(arr[i]<=0){
		        }
		        else{
		            arr[i]=arr[i]+k;
		        }
		    }
		}
		System.out.println("No.of jumps: "+count);
	}
}