//Toggle case of the string without inbuild function

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=a.nextLine();
        StringBuilder s=new StringBuilder(str);
        System.out.println("Orginal Input: "+s);
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)>=65 && s.charAt(i)<=90){
                    int c=(int)s.charAt(i)+32;
                    s.setCharAt(i,(char)c);
                }
                else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                    int c=(int)s.charAt(i)-32;
                    s.setCharAt(i,(char)c);
                }
            }
        System.out.println("Converted Toggle: "+s);
    }
}