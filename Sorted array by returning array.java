//Sorted array by returning array 

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static int[] sortArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Array size: ");
        int lim=s.nextInt();
        int[]arr=new int[lim];
        for(int i=0;i<lim;i++){
            System.out.print("Enter "+i+" element: ");
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        return arr;
        
    }
    public static void main(String[]args){
        int array[]=sortArray();
        System.out.print("Sorted array: ");
        for(int ele:array){
            System.out.print(ele+" ");
        }
        
    }
}