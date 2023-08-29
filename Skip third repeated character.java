//Skip third repeated character

import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner b=new Scanner(System.in);
	    System.out.println("Enter the String: ");
	    String str=b.nextLine();
	    StringBuilder s=new StringBuilder("");
		s.append(str);
		System.out.println(s);
		char ch;
		for(int i=0;i<s.length()-1;i++){
		    int a=i+2;
		    if((s.charAt(i)==s.charAt(i++))&& s.charAt(i)==s.charAt(a)){
		        s.delete(i,a);
		    }
		}
		System.out.println(s);
	}
}
