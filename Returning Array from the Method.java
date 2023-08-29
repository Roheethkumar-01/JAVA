//Returning Array from the Method

public class Main{
    //we must use static keyword while defining the function inside the main function
    public static int[] sendArray(){
        return new int[]{1,2,3};
    }
    public static void main(String[]args){
        int arr[]=sendArray();
        for(int a:arr){
            System.out.println(a);
        }
    }
}