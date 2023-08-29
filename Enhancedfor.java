//While loop
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        while(num>=0){
            System.out.println("Roheeth Kumar R J");
            num--;
        }
    }
}

//DO while
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        do{
            System.out.println("Roheeth Kumar R J");
            num--;
        }while(num>=0);
    }
}

//for
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println("Roheeth Kumar R J");
        }
    }
}
//Enhanced for
import java.util.Scanner;
public class Enhancedfor{
    public static void main(String[]args){
        int numbers[]={10,20,30,40,50,60,70};
        for(int n:numbers)
        {
            System.out.println(n);
        }
    }
}