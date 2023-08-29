//String builder

import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		StringBuilder buffer=new StringBuilder("Roheeth");
		System.out.println(buffer);
		buffer.append(" Kumar");
		System.out.println(buffer);
		buffer.insert(13," R J");
		System.out.println(buffer);
		buffer.replace(14,17,"Vijay");
		System.out.println(buffer);
		buffer.delete(8,14);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		System.out.println(buffer.charAt(2));
		System.out.println(buffer.length());
		System.out.println(buffer.substring(0,5));
		buffer.setCharAt(0,'E');
		System.out.println(buffer);
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("rk");
		System.out.println(sb.capacity());
		sb.append("Roheeth kumar is studying in saranathan college");
		System.out.println(sb.capacity());
	}
}
