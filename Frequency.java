//Frequency

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word=s.nextLine();
        char[] arr=word.toString().toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        System.out.println("The length of the word: "+str.length());
        int count=1;char ch=' ';
        while(true){
            if(str.length()==1){
                if(ch==str.charAt(0)){
                    System.out.println(str.charAt(0)+"->"+count);
                    break;
                }
                else{
                    System.out.println(str.charAt(0)+"->1");
                    break;
                }
            }
            if(str.charAt(0)==str.charAt(1)){
                count++;
                ch=str.charAt(0);
                str=str.substring(1);
            }
            else{
                if(ch==str.charAt(0)){
                    System.out.println(str.charAt(0)+"->"+count);
                    str=str.substring(1);
                    count=1;
                }
                else{
                    System.out.println(str.charAt(0)+"->1");
                    str=str.substring(1);
                    count=1;
                }
            }
        }
        
    }
}