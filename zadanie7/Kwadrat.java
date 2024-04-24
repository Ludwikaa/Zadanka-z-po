package zadanie7;

import zadanie7.Punkt;

public class Kwadrat extends Prostokat{
    
    public Kwadrat(String kolor, Punkt p, int bok){
        
        super(kolor, new Punkt(p.x, p.y), new Punkt(p.x+bok, p.y+bok));
        
    }
    
    public String toString(){
        return "Kwadrat: " + super.toString();
    }
    
}
