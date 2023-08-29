//Lowercase of the string without inbuild function and input from user
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=a.nextLine();
        StringBuilder s=new StringBuilder(str);
        System.out.println("Orginal Input: "+s);
        int i,val;
        char ch,change;
        for(i=0;i<=s.length()-1;i++){
            ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                val=(int)ch;
                val=val+32;
                change=(char)val;
                s.setCharAt(i,change);
            }
        }
        System.out.println("Converted Lowercase: "+s);
    }
}