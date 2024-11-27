package Semester_1.GrafischeDatenverarbeitung;

public class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt subtrahieren(Punkt p1){
        return new Punkt(this.x - p1.x, this.y - p1.y);
    }

    public double getLaenge(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

}
