package aufgaben.BibliothekAufgabe;

public class Exemplar {

    public User ausgeliehenVon;

    private int exemplarNummer;
    private String regal;
    private int position;

    public Exemplar(int exemplarNummer, String regal, int position) {
        this.exemplarNummer = exemplarNummer;
        this.regal = regal;
        this.position = position;
    }

    public void verleiheAn(User b){
        this.ausgeliehenVon = b;
    }

    public void print(){
        System.out.println("Exemplarnummer " +getExemplarNummer()+ " positioniert in " +getRegal()+ " an Stelle " +getPosition()+ "\nVerliehen an: "
                            +ausgeliehenVon.getVorname()+ " " +ausgeliehenVon.getNachname());
    }

    public void setExemplarNummer(int exemplarNummer){
        this.exemplarNummer = exemplarNummer;
    }
    public int getExemplarNummer(){
        return exemplarNummer;
    }
    public void setRegal(String regal){
        this.regal = regal;
    }
    public String getRegal(){
        return regal;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return position;
    }

}
