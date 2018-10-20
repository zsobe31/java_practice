
package dinopark;

public class Husevo extends Dino {
    
    private boolean veszelyes;
    
    public Husevo(){
        this.veszelyes = false;
    }
    
    //paraméteres konstruktor - házi
    public Husevo(String ujNev, int ujKor, boolean lanyE, boolean veszelyesE){
        this.veszelyes = veszelyesE;
        this.nev = ujNev;
        this.kor = ujKor;
        this.lany = lanyE;
    }
    
    public boolean isVeszelyes(){ // boolean típusú getter elnevezése IS
        return this.veszelyes;
    }
    
    public void megvadul(){
        this.veszelyes = true;
    }
    
    public void szelidit(){
        this.veszelyes = false;
    }
    
    
}
