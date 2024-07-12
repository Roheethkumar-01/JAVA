import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.print("Enter the month name to find quarter: ");
		String str1=sc.next();
        System.out.print("Enter the starting month name: ");
        String str=sc.next();
        String arr1[]=new String[12];
        int index=0;
        int index1=0;
        for(int i=0;i<arr.length;i++){
            if(str1.equalsIgnoreCase(arr[i])){
                index=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(str.equalsIgnoreCase(arr[i])){
                index1=i;
            }
        }
        System.out.println("Index of the quarter month to find: "+index);
        System.out.println("Index of the starting month: "+index1);
        for(int i=0;i<arr.length;i++){
            if(index1==12){
                index1=0;
            }
            arr1[i]=arr[index1];
            index1++;
        }
        // System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            if(arr1[i].equals(str1)){
                if(i<=11&&i>=9){
                    System.out.print("4");
                }
                if(i<=8&&i>=6){
                    System.out.print("3");
                }
                if(i<=5&&i>=3){
                    System.out.print("2");
                }
                if(i<=2&&i>=0){
                    System.out.print("1");
                }
            }
        }
	}
}