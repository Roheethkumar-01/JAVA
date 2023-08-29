//Transpose of the Matrix

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int i,j,k,l;
        System.out.print("Enter the row: ");
        int row=s.nextInt();
        System.out.print("Enter the column: ");
        int column=s.nextInt();
        int arr[][]=new int[row][column];
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print("Enter "+i+" "+j+" element: ");
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Before Transpose: ");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                            System.out.print(arr[i][j]+" ");
                        }
                        System.out.println("");
                    }
        System.out.println("After Transpose: ");        
        for(i=0;i<column;i++){
            for(j=0;j<row;j++){
                            System.out.print(arr[j][i]+" ");
                        }
                        System.out.println("");
                    }
                }
            }