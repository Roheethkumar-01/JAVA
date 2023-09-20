//cookie-juice problem.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String[] arr=new String[num];
		for(int i=0;i<num;i++){
		    arr[i]=s.next();
		}
		boolean result=true;
		for(int i=0;i<num-1;i++){
		    if("cookie".equals(arr[i+1])){
		        result=false;
		    }
		    break;
		}
		if(result){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
