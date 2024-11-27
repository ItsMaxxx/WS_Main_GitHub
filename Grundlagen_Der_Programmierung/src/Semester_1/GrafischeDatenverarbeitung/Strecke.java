package Semester_1.GrafischeDatenverarbeitung;

public class Strecke {

    private Punkt startpunkt;
    private Punkt endpunkt;

    public Strecke(Punkt startpunkt, Punkt endpunkt) {
        this.startpunkt = startpunkt;
        this.endpunkt = endpunkt;
    }

    public double getLaenge(){
        return Math.sqrt(Math.pow(getStartpunkt().getX() - getEndpunkt().getX(), 2) + Math.pow(getStartpunkt().getY() - getEndpunkt().getY(), 2));
    }

    public void moveStrecke(Punkt vektor){
        getStartpunkt().setX(getStartpunkt().getX() + vektor.getX());
        getStartpunkt().setY(getStartpunkt().getY() + vektor.getY());

        getEndpunkt().setX(getEndpunkt().getX() + vektor.getX());
        getEndpunkt().setY(getEndpunkt().getY() + vektor.getY());
    }


    public Punkt getStartpunkt() {
        return startpunkt;
    }

    public void setStartpunkt(Punkt startpunkt) {
        this.startpunkt = startpunkt;
    }

    public Punkt getEndpunkt() {
        return endpunkt;
    }

    public void setEndpunkt(Punkt endpunkt) {
        this.endpunkt = endpunkt;
    }


}
