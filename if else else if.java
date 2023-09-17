import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of subjects:");
		int num=s.nextInt();
		int sum=0,avg=0;
		for(int i=0;i<num;i++){
		    System.out.print("Enter the subject "+i+" mark:");
		    int mark=s.nextInt();
		    sum=sum+mark;
		}
		avg=sum/num;
		if(avg>=90&&avg<=100){
		    System.out.println("GRADE A");
		}
		else if(avg>=80&&avg<=89){
		    System.out.println("GRADE b");
		}
		else if(avg>=70&&avg<=79){
		    System.out.println("GRADE c");
		}
		else{
		    System.out.println("Fail");
		}
	}
}
