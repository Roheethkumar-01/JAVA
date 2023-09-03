//Reverse the entire sentence

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str=scanner.nextLine();
        String[] arr=str.split(" ");
        String[] arr1=new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[arr.length-1-i];
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<arr1.length;i++){
            s.append(arr1[i]).append(" ");
        }
        System.out.print("Reversed String: "+s);
        
    }
}