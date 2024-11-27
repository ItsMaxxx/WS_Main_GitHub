package aufgaben.GrafischeDatenverarbeitung;

public class Main {

    public static void main(String[] args){

        //aufgabe1();
        aufgabe2();


    }

    public static void aufgabe1(){
        Punkt p1 = new Punkt(1, 3);
        Punkt p2 = new Punkt(5, 8);
        Strecke strecke = new Strecke(p1, p2);
        Punkt vektor = new Punkt(3, 5);

        System.out.println(strecke.getStartpunkt().getX() + " " + strecke.getStartpunkt().getY());
        System.out.println(strecke.getEndpunkt().getX() + " " + strecke.getEndpunkt().getY());
        System.out.println("Laenge: " +strecke.getLaenge());

        strecke.moveStrecke(vektor);

        System.out.println(strecke.getStartpunkt().getX() + " " + strecke.getStartpunkt().getY());
        System.out.println(strecke.getEndpunkt().getX() + " " + strecke.getEndpunkt().getY());
        System.out.println("Laenge: " +strecke.getLaenge());
    }

    public static void aufgabe2(){

        Punkt p1 = new Punkt(1, 0);
        Punkt p2 = new Punkt(2, 2);
        Gerade g = new Gerade(p1, p2);
        Punkt funktion1 = g.funktionBerechnen(g.getStrecke());

        System.out.println("");

        Punkt p3 = new Punkt(0, 6);
        Punkt p4 = new Punkt(9, 0);
        Gerade g2 = new Gerade(p3, p4);
        Punkt funktion2 = g2.funktionBerechnen(g2.getStrecke());

        System.out.println(funktion1.toString());
        System.out.println(funktion2.toString());

    }


}
