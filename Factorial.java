//Factorial
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();
    int f=1;
    for(int i=1;i<=num;i++)
    {
        f=f*i;
    }
    System.out.println(f);
    }
}