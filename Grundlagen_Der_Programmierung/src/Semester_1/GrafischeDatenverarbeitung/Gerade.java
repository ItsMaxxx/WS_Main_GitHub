package Semester_1.GrafischeDatenverarbeitung;

public class Gerade {

    private Strecke strecke;
    public String funktion;

    public Gerade(Strecke strecke) {
        this.strecke = strecke;
    }
    public Gerade(Punkt p1, Punkt p2) {
        this.strecke = new Strecke(p1, p2);
    }

    /*public void intersect(Gerade g1){

    }*/

    public static Punkt funktionBerechnen(Strecke s){
        double startpunktLaenge = s.getStartpunkt().getLaenge();
        double endpunktLaenge = s.getEndpunkt().getLaenge();

        Punkt vektor;
        if(startpunktLaenge > endpunktLaenge){
            vektor = s.getStartpunkt().subtrahieren(s.getEndpunkt());
        }else{
            vektor = s.getEndpunkt().subtrahieren(s.getStartpunkt());
        }

        //System.out.println(vektor.getX());
        //System.out.println(vektor.getY());

        double mx = vektor.getY() / vektor.getX();

        double anzahlSchritte = s.getStartpunkt().getX();
        double b = s.getStartpunkt().getY();
        for(double i = anzahlSchritte; i > 0; i--){
            b -= mx;
        }

        //System.out.println(mx);
        //System.out.println(b);

        return new Punkt(mx, b);
    }





    public Strecke getStrecke() {
        return strecke;
    }
    public void setStrecke(Strecke strecke) {
        this.strecke = strecke;
    }


}
