//Two dimensional Arrays

import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
	   int i,j;
	   for(i=0;i<3;i++){
	       for(j=0;j<3;j++){
	           System.out.print(" "+arr[i][j]);
	       }
	       System.out.println("");
	   }
	 
	}
}

//Two dimensional arrays getting input from user

//Two dimensional Arrays

import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.print("Enter the row size: ");
	   int row=s.nextInt();
	   System.out.print("Enter the column size: ");
	   int col=s.nextInt();
	   int [][]arr=new int[row][col];
	   int i,j;
	   for(i=0;i<row;i++){
	       for(j=0;j<col;j++){
	           System.out.print("Enter "+i+" "+j+" element: ");
	           arr[i][j]=s.nextInt();
	       }
	   }
	   for(i=0;i<row;i++){
	       for(j=0;j<col;j++){
	           System.out.print(" "+arr[i][j]);
	       }
	       System.out.println("");
	   }
	}
}

//Jagged Array

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int arr[][]={{10,20,30},
                     {40,50},
                     {60,70,80}};
                     
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr[i].length;j++){
                
                System.out.print(" "+arr[i][j]);
                
            }
            System.out.println("");
        }
    }
}

//Jagged Array using Enhanced for

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int arr[][]={{10,20,30},
                     {40,50},
                     {60,70,80}};
                     
        for(int k[]:arr){
            for(int ele:k){
                System.out.print(" "+ele);
            }
            System.out.println("");
        }
    }
}

