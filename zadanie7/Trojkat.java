package zadanie7;

import zadanie7.Figura;
import zadanie7.Punkt;
import zadanie7.Linia;

public class Trojkat extends Figura {
    
    private Linia l1, l2, l3;
    
    public Trojkat(String kolor, Punkt p1, Punkt p2, Punkt p3){
        
        super(kolor);
        
        this.l1 = new Linia(p1, p2);
        this.l2 = new Linia(p2, p3);
        this.l3 = new Linia(p1, p3);
        
    }
    
    public String toString(){
        return "Trojkat: " + l1.toString() + " / " + l2.toString() + " / " + l3.toString();
    }
    
}
