package Semester_2.Abstrahierung;

public abstract class Fahrzeug {
    
    protected String id;
    protected int anzahlPassagiere = 4;
    
    public Fahrzeug(String meinName, int anzahlPassagiere) {
        super();
        this.id = meinName;
        this.anzahlPassagiere = anzahlPassagiere;
    }
    
    public Fahrzeug(String meinName) {
        super();
        this.id = meinName;
    }
    
    abstract void addPassenger(int i);
    abstract double getBremsweg();
    
    
    @Override
    public String toString() {
        return "Fahrzeug{" +
                "meinName='" + id + '\'' +
                ", anzahlPassagiere=" + anzahlPassagiere +
                '}';
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }
    
    public void setAnzahlPassagiere(int anzahlPassagiere) {
        this.anzahlPassagiere = anzahlPassagiere;
    }
}

