package zadanie6;


public class Zadanie6 {

    
    public static void main(String[] args) {
        
        Punkt p1 = new Punkt(10, 20);
        Punkt p2 = new Punkt(5, 15);
        Punkt p3 = new Punkt(0, -5);
        
        Linia odc1 = new Linia(p1, p2);
        Linia odc2 = new Linia(p2, p3);
        
        Punkt p4 = new Punkt(0, 0), p5 = new Punkt(1,1);
        Linia 11 = new Linia(p1, p2), 12 = new Linia(p1, p2);
        11.Przesun(5,5);
        System.out.println(11);
        System.out.println(12);
        
        
    }
    
}

class Punkt {
    
    private x, y;
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

class Linia {
    private Punkt p, q;
    public Linia(Punkt p, Punkt q){
        
        this.p = new Punkt(p);
        this.q = new Punkt(q);
        
    }
    
    public void Pezesun(int dx, int dy){
        
        p.Przesun(dx, dy);
        q.Przesun(dx, dy);
        
    }
    
    public strin toString(){
        
        return ;
    }
}

class Trojkat {
    
    
}

class Czworokat {
    
    
}

class Obraz{
    
    
}