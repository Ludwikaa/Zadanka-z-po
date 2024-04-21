package zadanie6;

import Zadanie6.Punkt;
import Zadanie6.Linia;
import Zadanie6.Trojkat;
import Zadanie6.Czworokat;
import Zadanie6.Obraz;

public class Zadanie6 {

    
    public static void main(String[] args) {
        

        
        Punkt p1 = new Punkt(0,0);
        Punkt p2 = new Punkt(1,1);
        Punkt p3 = new Punkt(1, 2);
        Punkt p4 = new Punkt(2, 2);
        Punkt p5 = new Punkt(1, 3);
        Punkt p6 = new Punkt(0, 2);
        //Punkt p7 = new Punkt(p4);
        //System.out.println(p4);
        
        Linia l1 = new Linia(p1, p2);
        Linia l2 = new Linia(p2, p3);
        Linia l3 = new Linia(p4, p5);
        Linia l4 = new Linia(p5, p6);
        
        Trojkat t1 = new Trojkat(l1, l2, l3);
        Trojkat t2 = new Trojkat(l2, l3, l4);
        
        Czworokat c1 = new Czworokat(l1, l2, l3, l4);
        
        System.out.println(t1.toString());
        t1.Przesun(2, 2);
        System.out.println(t1.toString());
        
        System.out.println(c1.toString());
        c1.Przesun(3, 2);
        System.out.println(c1.toString());
        
        Obraz o1 = new Obraz();
        o1.DodajTrojkat(t1);
        o1.DodajCzworokat(c1);
        System.out.println(o1.toString());
        o1.Przesun(2, 2);
        System.out.println(o1.toString());
        
        
    }
    
}

