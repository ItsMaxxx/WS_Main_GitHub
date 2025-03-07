package Semester_2.Interfaces;

public class Person {
    protected String vorname;
    protected String nachname;
    protected int personalnummer;

    public Person(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public Person(String vorname, String nachname, int personalnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.personalnummer = personalnummer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", personalnummer=" + personalnummer +
                '}';
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

}
