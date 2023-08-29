//Strong number or not=>Logic 145// fact of each number add and that must be equal

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        int i,rem,fact;
        int temp=num,sum=0;
        while(num>0){
           rem=num%10;
           fact=1;
           for(i=1;i<=rem;i++)
            {
            fact=fact*i;
            }
        System.out.println("Factorial of the number "+rem+" is: "+fact);
        num=num/10;
        sum=sum+fact;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println(temp+" is the Strong number");
        }
        else{
            System.out.println(temp+" is not the Strong number");
        }
    }
}