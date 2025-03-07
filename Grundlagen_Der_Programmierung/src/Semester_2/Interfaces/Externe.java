package Semester_2.Interfaces;

public class Externe extends Person implements Firmennummer{

    protected static String firma;
    protected String firmentelefonnummer;

    public Externe(int personalnummer) {
        super(personalnummer);
    }

    public Externe(String vorname, String nachname, int personalnummer, String firma) {
        super(vorname, nachname, personalnummer);
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Externe{" +
                ", personalnummer=" + personalnummer +
                "firma='" + firma + '\'' +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }

    public static String getFirma() {
        return firma;
    }

    public static void setFirma(String firma) {
        Externe.firma = firma;
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
