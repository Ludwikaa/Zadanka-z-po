package Zadanie6;

import java.util.ArrayList;


public class Obraz {
    
    ArrayList Trojkaty; 
    ArrayList Czworokaty; 
    
    public Obraz() {
        
        this.Trojkaty = new ArrayList();
        this.Czworokaty = new ArrayList();
        
    }
    
    public void DodajTrojkat(Trojkat t){
        
        Trojkaty.add(t);
        
    }
    
    public void DodajCzworokat(Czworokat d){
        
        Czworokaty.add(d);
        
    }
    
    public void Przesun(int dx, int dy){
        
        for (int i = 0; i < Trojkaty.size(); i++) {
            if (Trojkaty.get(i) instanceof Trojkat) {
                ((Trojkat) Trojkaty.get(i)).Przesun(dx, dy);
            }
        }

        for (int i = 0; i < Czworokaty.size(); i++) {
            if (Czworokaty.get(i) instanceof Czworokat) {
                ((Czworokat) Czworokaty.get(i)).Przesun(dx, dy);
            }
        }
    }
    
    public String toString(){
        
        String wyrazenie = "Obraz zawiera: \n";
        
        for(int i=0; i<Trojkaty.size(); i++){
            wyrazenie += Trojkaty.get(i).toString();
            wyrazenie += "\n";
        }
        
        for(int i=0; i<Czworokaty.size(); i++){
            wyrazenie += Czworokaty.get(i).toString();
            wyrazenie += "\n";
        }
        
        return wyrazenie;
    }
    
}
