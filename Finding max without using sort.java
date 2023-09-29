import java.util.*;
public class Main{
    public static void main(String[]args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of arraylist:");
        int num=s.nextInt();
        int ele;
        for(int i=1;i<=num;i++){
            System.out.print("Enter "+i+" element:");
            ele=s.nextInt();
            al.add(ele);
        }
        System.out.print("Enter the index of maximum element want to find:");
        int ind=s.nextInt();
        int rem=0;
        for(int j=0;j<ind;j++){
            int max=al.get(0);
            int index=0;
            for(int i=0;i<num;i++){
                if(max<al.get(i)){
                    max=al.get(i);
                    index=i;
                }
            }
            rem=al.remove(index);
            num=al.size();
        }
        System.out.println(ind+"th maximum element in the array is: "+rem);
    }
}