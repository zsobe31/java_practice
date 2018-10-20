
package dinopark;

import java.util.Random;

public class Novenyevok extends Dino {
    
    private String fogtipus;
    
    public Novenyevok(){
        Random xy = new Random();
        String[] tipusok = {"Örlő","Rágó"};
        this.fogtipus = tipusok[xy.nextInt(tipusok.length)];
    }
    
    public Novenyevok(String ujNev, int ujKor, boolean lanyE, String ujFogtipus){
        this.fogtipus = ujFogtipus;
        this.nev = ujNev;
        this.kor = ujKor;
        this.lany = lanyE;
    }
    
    public String getFogtipus(){
        return this.fogtipus;
    }
    
}
