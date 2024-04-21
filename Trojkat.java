package Zadanie6;



public class Trojkat {
    
    private Linia l1, l2, l3;
    
    public Trojkat(){
        
    }
    
    public Trojkat(Linia l1, Linia l2, Linia l3) {
        
        
        this.l1 = new Linia(l1);
        this.l2 = new Linia(l2);
        this.l3 = new Linia(l3);
        
    }
    
    public Trojkat(Trojkat t){
        
        this.l1 = t.l1;
        this.l2 = t.l2;
        this.l3 = t.l3;
    }
    
    public void Przesun(int dx, int dy){
        
        l1.Przesun(dx, dy);
        l2.Przesun(dx, dy);
        l3.Przesun(dx, dy);
    
    }
    
    public String toString(){
        return "Trojkat: " + l1.toString() + " / " + l2.toString() + " / " + l3.toString();
    }
    
}