package Zadanie6;

public class Punkt {
    
    private int x, y;
    
    public Punkt(){
        
    }
    

    public Punkt(int x, int y){
    
        this.x =  x;
        this.y = y;
        
    }
    
    public Punkt(Punkt p){
        
        this.x = p.x;
        this.y = p.y;
        
    }
    
    public void Przesun(int dx, int dy){
        
        x += dx;
        y += dy;
        
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
}