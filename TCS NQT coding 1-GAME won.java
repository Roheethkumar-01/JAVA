//TCS NQT coding 1-GAME won
//constraints: number:0 to 100, only a and b string, number to be the string length, which team won.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Who won the game?");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rounds conducted:");
		int num=s.nextInt();
		int counta=0,countb=0;
		if(num>0&&num<=100){
		    while(true){
		        System.out.print("Enter the game result as a string:");
		        String str=s.next();
		        boolean isValid=true;
		        for(int i=0;i<str.length();i++){
		            char c=str.charAt(i);
		            if(c!='a'&&c!='b'){
		                isValid=false;
		                break;
		            }
		        }
		 if(str.length()==num&&isValid&&!str.isEmpty()){
		    for(int i=0;i<str.length();i++){
		        if(str.charAt(i)=='a'){
		            counta++;
		        }
		        else{
		            countb++;
		        }
		    }
		    if(counta>countb){
		        System.out.println("TEAM A WON");
		        break;
		    }
		    else if(counta==countb){
		        System.out.println("MATCH DRAW");
		        break;
		    }
		    else{
		        System.out.println("TEAM B WON");
		        break;
		    }
		    }
		    else{
		        System.out.println("Enter the valid input");
		    }
		    }
		}
	}
}
