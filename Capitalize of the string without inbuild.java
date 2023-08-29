//Capitalize of the string without inbuild function

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=a.nextLine();
        StringBuilder s=new StringBuilder(str);
        System.out.println("Orginal Input: "+s);
        if(s.charAt(0)>=97 && s.charAt(0)<=122){
            int c=(int)s.charAt(0)-32;
            s.setCharAt(0,(char)c);
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==32){
                i++;
                if(s.charAt(i)>=97 && s.charAt(i)<=122){
                    int c=(int)s.charAt(i)-32;
                    s.setCharAt(i,(char)c);
                }
            }
            else{
                if(s.charAt(i)>=65 && s.charAt(i)<=90){
                    int c=(int)s.charAt(i)+32;
                    s.setCharAt(i,(char)c);
                }
            }
        }
        System.out.println("Converted capitalize: "+s);
    }
}