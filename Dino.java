
package dinopark;

import java.util.Random;

public class Dino {
    
    public String nev;
    protected int kor;
    protected boolean lany;
    
    // paraméter nélküli konstruktor
    public Dino(){
        this.nev = "Új Dínó";
        this.kor = 0;
        Random xy = new Random();
        this.lany = xy.nextBoolean();
    }
    
    // paraméteres konstruktor
    public Dino(String ujNev, int ujKor, boolean lanyE){
        this.nev = ujNev;
        this.kor = ujKor;
        this.lany = lanyE;
    }
    
    // publikus név tulajdonságra nem kell getter vagy setter
    public int getKor(){
        return this.kor;
    }
    
    public void szulinap(){
        this.kor++;
    }
    
    public boolean lanyE(){
        return this.lany;
    }
    // settert nem veszünk fel a nem tulajdonsághoz
    
    public void uvolt(){
        System.out.println("AAAAAARRRGGGG");
    }
    
    public Dino parosodik(Dino kiszemelt){
        Dino u = null;
        if( this.lany != kiszemelt.lanyE() ){
            u = new Dino();
            u.nev = this.nev + " " + kiszemelt.nev;
        }
        return u;
    }
    
    public static Dino parosodas(Dino egyik, Dino masik){
        Dino u = null;
        if( egyik.lanyE() != masik.lanyE() ){
            u = new Dino();
            u.nev = egyik.nev + " " + masik.nev;
        }
        return u;
    }
    
    
    
}
