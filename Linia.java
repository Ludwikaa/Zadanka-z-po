package Zadanie6;


public class Linia {
    private Punkt p, q;
    public Linia(Punkt p, Punkt q){
        
        this.p = new Punkt(p);
        this.q = new Punkt(q);
        
    }
    
    public void Przesun(int dx, int dy){
        
        p.Przesun(dx, dy);
        q.Przesun(dx, dy);
        
    }
    
//    public strin toString(){
//        
//        return ;
//    }
}