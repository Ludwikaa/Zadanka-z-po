package zadanie7;

import zadanie7.Punkt;

public class Prostokat extends Czworokat{
    
    public Prostokat(){
       
        
    }
    
    public Prostokat(String kolor, Punkt p1, Punkt p2){
        super(kolor, p1, new Punkt(p1.x, p2.y), p2, new Punkt(p2.x, p1.y));
    }
    
    public String toString(){
        return "Prostokat: " + super.toString();
    }
    
}
