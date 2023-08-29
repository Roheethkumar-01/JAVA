//Interface

interface Animal{
    void sleep();
    void sound();
}
class Dog implements Animal{
    public void sleep(){
        System.out.println("Wowow");
    }
    public void sound(){
        System.out.println("zzzzzzz");
    }
}
public class Main{
    public static void main(String[]args){
        Dog d=new Dog();
        d.sound();
        d.sleep();
    }
}
