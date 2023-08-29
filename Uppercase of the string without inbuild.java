//Uppercase of the string without inbuild function

public class Main{
    public static void main(String[]args){
        StringBuilder s=new StringBuilder("Hi i am roheeth");
        System.out.println(s);
        int i,val;
        char ch,change;
        for(i=0;i<=s.length()-1;i++){
            ch=s.charAt(i);
            if(ch>=97 && ch<=122){
                val=(int)ch;
                val=val-32;
                change=(char)val;
                s.setCharAt(i,change);
            }
        }
        System.out.println(s);
    }
}