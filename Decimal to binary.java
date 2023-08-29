//Decimal to binary

import java.util.Scanner;
class d2b{
    public static void deci2bin(int n){
        int binary[]=new int[1000];
        int i=0;
        while(n>0){
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        System.out.print("Converted binary number: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the decimal number: ");
	    int num=s.nextInt();
		d2b d=new d2b();
		d.deci2bin(num);
	}
}
