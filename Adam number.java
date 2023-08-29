//Adam number

import java.util.Scanner;
class adamnumber{
    public static boolean adam(int num,int num1){
        int temp,temp1,rem,rev=0;
        temp=num*num;
        temp1=num1*num1;
        while(temp1!=0){
            rem=temp1%10;
            rev=(rev*10)+rem;
            temp1/=10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the 1st num: ");
		int num=s.nextInt();
		System.out.print("Enter the 2nd num: ");
		int num1=s.nextInt();
		boolean ad=adamnumber.adam(num,num1);
		if(ad){
		    System.out.print("Its an Adam number");
		}
		else{
		    System.out.print("No,it's not an Adam number");
		}
	}
}
