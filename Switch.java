import java.util.Scanner;
public class Switch
{
	public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=s.nextInt();
        System.out.println("Enter the second number");
        b=s.nextInt();
        System.out.println("Enter your choice");
        ch=s.nextInt();
        switch (ch)
        {
            case 1:
                c=a+b;
                System.out.println("1.Addition"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("2.Subtraction"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("3.Multiplication"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("4.Division"+c);
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
	}
}
