package Semester_2.Interfaces;

public class ComparablePerson implements Comparable<ComparablePerson> {
    protected String vorname;
    protected String nachname;
    protected Integer personalnummer;

    public ComparablePerson(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public ComparablePerson(String vorname, String nachname, int personalnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.personalnummer = personalnummer;
    }

    @Override
    public int compareTo(ComparablePerson other) {
        return this.personalnummer.compareTo(other.personalnummer);
    }

//    @Override
//    public int compareTo(ComparablePerson o) {
//        // Zuerst nach personalNr (absteigend)
//        int result = Integer.compare(o.getPersonalNr(), this.personalNr);
//
//        // Falls personalNr gleich ist, nach vorname (aufsteigend)
//        if (result == 0) {
//            return this.vorname.compareTo(o.getVorname());
//        }
//        return result;
//    }

    //----------------------------------------------------------------

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
