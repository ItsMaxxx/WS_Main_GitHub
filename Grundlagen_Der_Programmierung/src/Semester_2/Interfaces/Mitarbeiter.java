package Semester_2.Interfaces;

public class Mitarbeiter extends Person implements Firmennummer{

    protected static double gehalt = 3900;
    protected String firmentelefonnummer;

    public Mitarbeiter(int personalnummer) {
        super(personalnummer);
    }

    public Mitarbeiter(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname, personalnummer);
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                ", personalnummer=" + personalnummer +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", gehalt=" + gehalt +
                '}';
    }

    public static double getGehalt() {
        return gehalt;
    }

    public static void setGehalt(double gehalt) {
        Mitarbeiter.gehalt = gehalt;
    }

    @Override
    public String getFirmentelefonnummer() {
        return this.firmentelefonnummer;
    }

    @Override
    public void setFirmentelefonnummer(String firmentelefonnummer) {
        this.firmentelefonnummer = firmentelefonnummer;
    }
}
