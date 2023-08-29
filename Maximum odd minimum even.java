//Maximum odd minimum even

import java.util.*;
public class minoddmaxeven
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("***Enter minimum of 10 elements***");
        System.out.print("Enter the number of elements: ");
        int lim=s.nextInt();
        int arr[]=new int[lim];
        for(int i=0;i<lim;i++){
            System.out.print("Enter "+i+" element: ");
            arr[i]=s.nextInt();
        }
        int countodd=0;
        int counteven=0;
        for(int i=0;i<lim;i++){
            if(arr[i]%2==0){
                ++counteven;
            }
            else{
                ++countodd;
            }
        }
 		/*System.out.println(countodd);
 		System.out.println(counteven);*/
        int odd[]=new int[countodd];
        int even[]=new int[counteven];
        int eCount=0,oCount=0;
        for(int i=0;i<lim;i++){
            if(arr[i]%2==0) {
                even[eCount++] = arr[i];
            } else{
                odd[oCount++]=arr[i];
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        for(int i=oCount-1,c=0;i>=0;i--){
            if(c==3){
                break;
            }
            System.out.println(odd[i]+" ");
            ++c;
        }
        System.out.println();
        for(int i=0,c=0;i<eCount;i++) {
            if (c == 3) {
                break;
            }
            System.out.println(even[i] + " ");
            ++c;
        }
    }
}