package aufgaben.BibliothekAufgabe;

public class User {

    private int id;
    private String vorname;
    private String nachname;

    public User(int id, String vorname, String nachname){
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void print(){
        System.out.println("User ID: " +getId()+ ", Name: " +getVorname()+ " " +getNachname());
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }



}
