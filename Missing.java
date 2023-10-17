import java.util.*;
public class Missing
{
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the limit of 1st array: ");
        int lim=s.nextInt();
        System.out.print("Enter the limit of 2nd array: ");
        int lim1=s.nextInt();
        int sum=0,sum1=0;
        int[] arr=new int[lim];
        int[] arr1=new int[lim1];
        for(int i=0;i<lim;i++){
            System.out.print("Enter 1st arrays ["+i+"]: ");
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        for(int i=0;i<lim1;i++){
            System.out.print("Enter 2nd arrays ["+i+"]: ");
            arr1[i]=s.nextInt();
            sum1+=arr1[i];
        }
        int diff=sum-sum1;
        System.out.print("The missing element is: "+diff);
	}
}
