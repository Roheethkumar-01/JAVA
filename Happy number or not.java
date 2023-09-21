//Happy number or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int num=s.nextInt();
		System.out.print("How many times do you want to run the loop: ");
		int n=s.nextInt();
		int org=num,rem=0,fir=0,sum=0;
		int i=0;
		while(i<n){
		    int temp=num;
		    rem=temp%10;
		    fir=num/10;
		    sum=(fir*fir)+(rem*rem);
		    num=sum;
		    i++;
		}
		if(num==1){
		    System.out.println(org+" is the happy number");
		}
		else{
		    System.out.println(org+" is not the happy number");
		}
	}
}
