//Group switch
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        char c;
        System.out.println("Enter the Character");
        Scanner s=new Scanner(System.in);
        c=s.next().charAt(0);
        switch(c){
            
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(c + "is a vowels");
                    break;
                default:
                    System.out.println("Not a vowel");
                    break;
        }
    }
}