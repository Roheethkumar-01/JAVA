//Fibonacci series using recursion
import java.util.*;
public class Main
{
    public static int fibo(int a){//3 2 1
        if(a<=1){
            return a;
        }
        
            return fibo(a-1) + fibo(a-2);//fibo(2)  fibo(1)--1 fibo(0)
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
		System.out.println(fibo(i));
		}
	}
}