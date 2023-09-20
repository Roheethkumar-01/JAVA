//Arraylist 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.print("Enter how many elements do u want: ");
		int num=s.nextInt();
		for(int i=0;i<num;i++){
		    System.out.print("Enter "+i+" element: ");
		    int n=s.nextInt();
		    a.add(n);
		}
		System.out.println(a);
		System.out.println("**SOME OPERATIONS**");
		a.add(99);//add
		a.add(100);//add
		a.remove(2);//delete
		System.out.println(a.get(0));//get
		a.set(0,1000);//update
		System.out.println(a);
		System.out.println("*****USING ITERATOR*****");
		Iterator<Integer> i=a.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
	}
}
