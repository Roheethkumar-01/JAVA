//Sum and average
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n=s.nextInt();
    int sum=0,avg=0;
    for(int i=1;i<=n;i++)
    {
        System.out.print("Enter the number"+i+":");
        int a=s.nextInt();
        sum+=a;
        avg=sum/n;
    }
    System.out.print("Sum="+sum);
    System.out.print("Average="+avg);
    }
}