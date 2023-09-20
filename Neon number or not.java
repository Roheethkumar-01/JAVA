//Neon number or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp,rem=0,res=0;
		temp=num*num;
		while(temp!=0){
		    rem=temp%10;
		    res=res+rem;
		    temp/=10;
		}
		if(num==res){
		System.out.print(num+" is the neon number");}
		else{
		    System.out.print("Not the neon");
		}
	}
}
