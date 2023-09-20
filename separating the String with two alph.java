//separating the String with two alphabets

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=s.next();
        if(str.length()%2!=0){
         str=str+'x';   
        }
        for(int i=0;i<str.length();i+=2){
                System.out.print(str.charAt(i)+""+str.charAt(i+1)+" ");   
        }
    }
}