// import java.io.*;
interface compute
{
    final int byt = 3;
    final int euro = 5;
    void convert();
    void display();
}
class by_to_kby implements compute
{
    float kby;
    public void convert(){
        kby = (float) (byt * 0.0001);
    }
    public void display(){
        System.out.print(byt + " bytes to " + kby + "kilobytes\n");
    }
}
class eu_to_ru implements compute
{
    float ru;
    public void convert(){
        ru = (float) (euro * 89.93);
    }
    public void display(){
        System.out.print(euro + " euros to " + ru + " rupees");
    }
}
public class interfaces
{
    public static void main(String[] args){
        by_to_kby btk = new by_to_kby();
        btk.convert();
        btk.display();
        eu_to_ru etr = new eu_to_ru();
        etr.convert();
        etr.display();
    }
}
