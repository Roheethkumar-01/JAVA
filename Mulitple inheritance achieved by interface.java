//Mulitple inheritance achieved by interface

class phone{
    void voice(){
        System.out.println("Voice");
    }
    void sms(){
        System.out.println("Sms");
    }
}
interface camera{
    void click();
}
interface player{
    void play();
}
class smartphone extends phone implements camera,player{
    public void click(){
        System.out.println("Selfie");
    }
    public void play(){
        System.out.println("Music");
    }
    
}
public class Main{
    public static void main(String[]args){
        smartphone s=new smartphone();
        s.click();
        s.play();
        s.sms();
        s.voice();
    }
}