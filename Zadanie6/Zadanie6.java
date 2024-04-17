package zadanie6;

import Zadanie6.Punkt;
import Zadanie6.Linia;

public class Zadanie6 {

    
    public static void main(String[] args) {
        
        Punkt p1 = new Punkt(10, 20);
        Punkt p2 = new Punkt(5, 15);
        Punkt p3 = new Punkt(0, -5);
        
        Linia odc1 = new Linia(p1, p2);
        Linia odc2 = new Linia(p2, p3);
        
        Punkt p4 = new Punkt(0, 0), p5 = new Punkt(1,1);
        odc1.Przesun(5,5);
        System.out.println(11);
        System.out.println(12);
        
        
    }
    
}

