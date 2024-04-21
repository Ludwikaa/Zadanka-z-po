package Zadanie6;


public class Czworokat {
    
    private Linia l1, l2, l3, l4;
    
    public Czworokat(){
        
    }
    
    public Czworokat(Linia l1, Linia l2, Linia l3, Linia l4) {
        
        this.l1 = new Linia(l1);
        this.l2 = new Linia(l2);
        this.l3 = new Linia(l3);
        this.l4 = new Linia(l4);
        
    }
    
     public Czworokat(Czworokat c){
        
         this.l1 = c.l1;
         this.l2 = c.l2;
         this.l3 = c.l3;
         this.l4 = c.l4;
         
    }
        
    public void Przesun(int dx, int dy){
        
        l1.Przesun(dx, dy);
        l2.Przesun(dx, dy);
        l3.Przesun(dx, dy);
        l4.Przesun(dx, dy);
       
    }
    
    public String toString(){
        return "Czworokat: " + l1.toString() + " / " + l2.toString() + " / " + l3.toString() + " / " + l4.toString();
    }
}
