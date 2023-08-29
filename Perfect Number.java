//Perfect Number=>logic add the factors which is equal to given number

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num=s.nextInt();
	    int i;
	    int sum=0;
	    for(i=1;i<num;i++){
	        if(num%i==0){
	            sum=sum+i;
	        }
	    }
	    if(sum==num){
	         System.out.println(num+ " is Perfect Number");
	    }
	    else{
	         System.out.println(num+ " is Not the Perfect Number");
	    }
	}
}