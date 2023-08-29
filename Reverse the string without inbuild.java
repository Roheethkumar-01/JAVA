//Reverse the string without inbuild function

public class Main{
    public static void main(String[]args){
        StringBuilder s=new StringBuilder("Hi i am roheeth");
        System.out.println(s);
        StringBuilder r=new StringBuilder();
        int i;
        char ch;
        for(i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            r.append(ch);
        }
        System.out.println(r);
    }
}