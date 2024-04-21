package Zadanie6;


public class Linia {
    
    private Punkt p, q;
    
    public Linia(){
        
    }
    
    public Linia(Punkt p, Punkt q){
        
        this.p = new Punkt(p);
        this.q = new Punkt(q);
        
    }
    
    public Linia(Linia L){
        
        this.p = L.p;
        this.q = L.q;
        
    }
    
    public void Przesun(int dx, int dy){
        
        p.Przesun(dx, dy);
        q.Przesun(dx, dy);
        
    }
    
    public String toString(){
        
        return p.toString() + " , " + q.toString();
   }
}