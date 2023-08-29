//Method overriding(Run time polymorphism)

import java.util.*;
class details{
    int age;String name;
    details(int num,String na){
        age=num;
        name=na;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class innum extends details{
    String company;
    innum(int num,String na,String c){
        super(num,na);
        company=c;
    }
    void display(){
        System.out.print("Name: "+name+", ");
        System.out.print("Age: "+age+", ");
        System.out.println("Company: "+company);
    }
}
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lim=s.nextInt();
        innum[] obj=new innum[lim];
        for(int i=0;i<lim;i++){
            s.nextLine();
            System.out.print("Enter the name: ");
            String peru=s.nextLine();
            System.out.print("Enter the company: ");
            String thurai=s.nextLine();
            System.out.print("Enter the age: ");
            int vayasu=s.nextInt();
            obj[i]=new innum(vayasu,peru,thurai);    
        }
        for(int i=0;i<lim;i++){
            obj[i].display();    
        }
    }
}