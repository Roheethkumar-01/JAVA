//Given a square matrix finding the lower triangle's sum.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row size:");
		int row=s.nextInt();
		System.out.print("Enter the column size:");
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		int i,j,sum=0;
		for(i=0;i<row;i++){
		    for(j=0;j<col;j++){
		        System.out.print("Enter ["+i+"]["+j+"]: ");
		        arr[i][j]=s.nextInt();
		    }
		}
		for(i=0;i<row;i++){
		    for(j=0;j<col;j++){
		    System.out.print(arr[i][j]+" ");
		    }
		    System.out.println("");
		}
		for(i=0;i<row;i++){
		    for(j=i;j<col;j++){
		        sum+=arr[j][i];
		    }
		}
		System.out.println("Sum of numbers in lower triangle= "+sum);
	}
}
