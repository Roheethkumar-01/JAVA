//Push zero to end of the array

import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.print("Enter the limit: ");
   int lim=s.nextInt();
   int[] arr=new int[lim];
   for(int i=0;i<lim;i++){
       System.out.print("Enter "+i+" element: ");
       arr[i]=s.nextInt();
   }
int i;
int len=arr.length-1;
        for(int j=0;j<len;j++){
            for(i=0;i<len;i++){
   if(arr[i]==0){
       int temp;
       temp=arr[i];
       arr[i]=arr[i+1];
       arr[i+1]=temp;
   }
}    
    }
System.out.println(Arrays.toString(arr));
}
}
