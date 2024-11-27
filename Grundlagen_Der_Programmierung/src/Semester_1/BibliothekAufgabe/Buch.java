package Semester_1.BibliothekAufgabe;

public class Buch {

    public Exemplar[] exemplare = new Exemplar[10];
    public User[] autoren = new User[10];

    private String titel;
    private String isbn;
    private int jahr;

    private static int count;
    static {
        count = 0;
    }

    public static int getCount(){
        return count;
    }

    public Buch(String titel, String isbn, int jahr, User author) {
        this.titel = titel;
        this.isbn = isbn;
        this.jahr = jahr;
        this.autoren[0] = author;
        Buch.count++;
    }

    public void addExemplar(Exemplar ex) {
        for (int i = 0; i < exemplare.length; i++) {
            if (exemplare[i] == null) {
                exemplare[i] = ex;
                break;
            }
        }
    }

    public boolean equals(Buch b){
        if(this.getIsbn() == b.getIsbn()){
            return true;
        }
        return false;
    }

    public Buch kopie(){
        return new Buch(this.getTitel(), this.getIsbn(), this.getJahr(), this.autoren[0]);
    }


    public void print() {
        System.out.println("Buch '" + getTitel()+ "' aus dem Jahre " +getJahr()+ " mit ISBN " +getIsbn()+ " geschrieben von:");
        for (int i = 0; i < autoren.length; i++) {
            if (autoren[i] != null) {
                autoren[i].print();
            }
        }
        for(Exemplar e : exemplare){
            if(e!=null){
                e.print();
            }
        }
    }

    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getJahr() {
        return jahr;
    }
    public void setJahr(int jahr) {
        this.jahr = jahr;
    }


}
