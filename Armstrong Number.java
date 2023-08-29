//Armstrong Number
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        int temp=num,arm=0,cube=0,rem=0;
        while(temp!=0){
            rem=temp%10;
            cube=rem*rem*rem;
            arm=arm+cube;
            temp=temp/10;
            
        }
        if(arm==num){
            System.out.println("The given "+num+" is armstrong number");
        }
        else{
            System.out.println("The given "+num+" is not armstrong number");
        }
    }
}

//Find the Armstrong number within 999.(NOT CORRECT)
public class Main{
    public static void main(String[]args){
        int temp,arm=0,cube=0,rem=0;
        for(int number=100;number<=999;number++){
            temp=number;
            rem=temp%10;
            cube=rem*rem*rem;
            arm=arm+cube;
            temp=temp/10;   
        if(arm==number)
        {
            System.out.println(number+" is armstrong number");
        }
        }
    }
}