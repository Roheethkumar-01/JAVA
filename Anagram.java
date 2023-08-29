//Anagram

import java.util.Scanner;
import java.util.Arrays;
class anagram{
    public static boolean ana(String str,String str1){
        boolean result=false;
        StringBuilder word=new StringBuilder(str);
        char[] arr=word.toString().toCharArray();
        StringBuilder word1=new StringBuilder(str1);
        char[] arr1=word1.toString().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length-1;i++){
            if(Character.toLowerCase(arr[i])==Character.toLowerCase(arr1[i])){//(Ignoring case)
                result=true;
            }
            else{
                return false;
            }
        }
        return result;
    }
}
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st word: ");
        String str=s.next();
        System.out.print("Enter 2nd word: ");
        String str1=s.next();
        boolean an=anagram.ana(str,str1);
        if(an){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}