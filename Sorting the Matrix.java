//Sorting the Matrix

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int count=0;
	    System.out.print("Enter the row size:");
	    int row=s.nextInt();
	    System.out.print("Enter the column size:");
	    int col=s.nextInt();
	    int[][] arr=new int[row][col];
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            System.out.print("Enter"+"["+i+"]["+j+"] element:");
	            arr[i][j]=s.nextInt();
	        }
	    }
	int max=arr[0][0];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(max<arr[i][j]){
                max=arr[i][j];
            }
        }
    }
    System.out.println("The Sorted Matrix is : ");
    for(int i=0;i<=max;i++){
        for(int j=0;j<row;j++){
            for(int k=0;k<col;k++){
                if(i==arr[j][k]){
                    count++;
                    System.out.print(arr[j][k]+" ");
                }
                if(count==col){
                    System.out.println("");
                    count=0;
                }
            }
        }
    }
	}
}
