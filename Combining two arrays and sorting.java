//Combining two arrays and sorting

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the 1st array limit: ");
        int lim=s.nextInt();
        int arr[]=new int[lim];
        for(int i=0;i<lim;i++){
            System.out.print("Enter "+i+" element: ");
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the 2nd array limit: ");
        int lim1=s.nextInt();
        int arr1[]=new int[lim1];
        for(int i=0;i<lim;i++){
            System.out.print("Enter "+i+" element: ");
            arr1[i]=s.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr1));
        int length=arr.length+arr1.length;
        int[] arr2=new int[length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr2[arr1.length+i]=arr1[i];
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}