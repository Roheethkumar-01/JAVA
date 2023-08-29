//Array objects

import java.util.Scanner;
class Students{
    int roll;String name;
    Students(int n,String na){
        this.roll=n;
        this.name=na;
    }
    void print(){
        System.out.println("Roll No: "+roll);
        System.out.println("Name: "+name);
        System.out.println("---------------------------");
    }
}

public class Main
{
	public static void main(String[] args) {
    Students[] o=new Students[5];
    o[0]=new Students(01,"Almas");
    o[1]=new Students(02,"Arul");
    o[2]=new Students(03,"Arun");
    o[3]=new Students(04,"Avinash");
    o[4]=new Students(05,"Bala");
    for(int i=0;i<5;i++){
        o[i].print();
    }
	}
}

//Array objects by getting input from user

import java.util.Scanner;
class Students{
    int roll;
    String name;
    Students(int x,String y){
        roll=x;
        name=y;
    }
    void print(){
        System.out.println("");
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("--------------------");
    }
}
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int lim=s.nextInt();
        Students[] o=new Students[lim];
        for(int i=0;i<lim;i++){
            int m=i+1;
            System.out.print("Enter "+m+" roll number: ");
            int num=s.nextInt();
            System.out.print("Enter "+m+" student name: ");
            String na=s.next();
            o[i]=new Students(num,na);
        }
        for(int i=0;i<lim;i++){
            o[i].print();
        }
    }
}