
package dinopark;

import java.util.ArrayList;
import java.util.List;

public class DinoPark {

    public static void main(String[] args) {

        Dino d = new Dino();
        System.out.println(d.nev + " " + d.getKor() + " éves");
        
        Dino i = new Dino("Eszmeralda", 17, true);
        
        System.out.println(i.nev);
        
        d.nev = "Rapi";
        d.szulinap();
        System.out.println(d.nev + " " + d.getKor() + " éves");
        d.szulinap();
        System.out.println(d.nev + " " + d.getKor() + " éves");
        if( d.lanyE() ){// d.lanyE == true;
            System.out.println(d.nev + " lány");
        }
        else{
            System.out.println(d.nev + " fiú");
        }
        
        d.uvolt();
        i.uvolt();
        
        try {
            Dino utod = d.parosodik(i);
            System.out.println(utod.nev);

            Dino masodikUtod = Dino.parosodas(i, d);
            System.out.println(masodikUtod.nev);
            
            List<Dino> ketrec = new ArrayList();
            ketrec.add(i);
            ketrec.add(d);
            ketrec.add(utod);
            ketrec.add(masodikUtod);
            
        }
        catch( Exception ex ){
            System.out.println("Hiba történt, a dínók nem párodostak! (" + ex.toString() + ")");
        }
               
        Novenyevok n = new Novenyevok();
        System.out.println(n.getFogtipus());
        System.out.println(n.getKor());
        n.uvolt();
        
        Novenyevok o = new Novenyevok("Növényevődinó", 12, true, "Örlő");
        System.out.println(o.nev + o.kor + " éves, neme: " + o.lany + " foga " + o.getFogtipus());
        
        Husevo h = new Husevo();
        System.out.println(h.nev + " " + h.isVeszelyes());
        h.megvadul();
        System.out.println(h.isVeszelyes());
        h.szelidit();
        System.out.println(h.isVeszelyes());
        
    }
    
}

// házi osztály, min 3 tulajdonság
// ital osztály

// új házi
// ital - különböző fajta folyadékok - ürtartalom mindegyiknél közös —> ősosztály - töltik