package Zadanie6;

public class Punkt {
    
    private int x, y;
    public Punkt(){}
    public Punkt(int x, int y){}
    public Punkt(Punkt p){}
    
    public void Przesun(int dx, int dy){
        
        x += dx;
        y += dy;
        
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
}