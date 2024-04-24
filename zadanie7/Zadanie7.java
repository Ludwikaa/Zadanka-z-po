package zadanie7;

public class Zadanie7 {

    public static void main(String[] args) {
        Punkt p1 = new Punkt(2, 4);
        Punkt p2 = new Punkt(7, 1);
        Punkt p3 = new Punkt(9, 2);
        Punkt p4 = new Punkt(3, 4);

        Trojkat t1 = new Trojkat("czarny", p1, p2, p3);
        Czworokat cz1 = new Czworokat("czarny", p1, p2, p3, p4);
        Prostokat pr1 = new Prostokat("biały", p2, p4);
        Kwadrat k1 = new Kwadrat("zielony", p1, 2);

        System.out.println(t1.toString());
        System.out.println(cz1.toString());
        System.out.println(pr1.toString());
        System.out.println(k1.toString());

    }
    
}
