//count uppercase,lowercase,space, number,vowels,symbols in a string
public class Main
{
	public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Roheeth-kumar is @ Trichy");
        System.out.println(a);
        int upper=0,lower=0,space=0,number=0,vowels=0,symbols=0;
        char ch;
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);
            if(ch>=65 && ch<=90){
                upper++;
            }
            if(ch>=97 && ch<=122){
                lower++;
            }
            if(ch==32){
                space++;
            }
            if(ch>=48 && ch<=57){
                number++;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }
        }
        symbols=a.length()-(upper+lower+space+number);
        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+lower);
        System.out.println("Space: "+space);
        System.out.println("Numbers: "+number);
        System.out.println("Vowels: "+vowels);
        System.out.println("Symbols: "+symbols);
        
	}
}

