//Arithmetic operation using switch

import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice:");
        int select=s.nextInt();
        System.out.print("Enter the first number: ");
        int num1=s.nextInt();
        System.out.print("Enter the second number: ");
        int num2=s.nextInt();
        int num3=0;
        switch(select){
            case 1:
                num3=num1+num2;
                System.out.println("Additon: "+num3);
                break;
            case 2:
                num3=num1-num2;
                System.out.println("Subtraction: "+num3);
                break;
            case 3:
                num3=num1*num2;
                System.out.println("Multiplication: "+num3);
                break;
            case 4:
                num3=num1/num2;
                System.out.println("Division: "+num3);
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}