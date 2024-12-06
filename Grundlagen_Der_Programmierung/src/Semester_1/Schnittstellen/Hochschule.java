package Semester_1.Schnittstellen;

public class Hochschule implements Mitarbeiterdaten {
    public final static int sth = 100;
    Mitarbeiterdaten[] mitDaten = new Mitarbeiterdaten[sth];

    public Hochschule(){

    }

    public String toString(){
        return "";
    }
    
    @Override
    public void setGehalt(double gehalt) {
        //
    }

    @Override
    public double getGehalt() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getNachname() {
        return "";
    }

    @Override
    public String getGeschlecht() {
        return "";
    }

    @Override
    public void setGeschlecht(String str) {
        //
    }

}
