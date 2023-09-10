//Rail fence algorithm

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Enter the plain Text: ");
        String str=sc.next();
        System.out.print("Enter the limit: ");
        int lim=sc.nextInt();
        System.out.println("Encryption:");
        for(int j=0;j<lim;j++){
            for(int i=j;i<str.length();i+=lim){
                System.out.print(str.charAt(i));
            }
        }
}
}