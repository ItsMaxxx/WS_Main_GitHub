package aufgaben.BibliothekAufgabe;
//Aufgaben Bibliothek I, II, III, IV, V, VI, VII

public class Bibliothek {

    public Buch[] buecher = new Buch[100];
    public User[] users = new User[20];

    public String institutionsName;
    public String standort;

    public static void main(String[] args) {
        Bibliothek bib = new Bibliothek("DHBW", "Coblitzallee");

        User user1 = new User(11, "Max", "Mustermann");
        User user2 = new User(12, "Anna", "Meier");
        bib.addUser(user1);
        bib.addUser(user2);

        //Erstellen von 2 Buechern mit ihren Exemplaren
        Buch b1 = new Buch("Java fuer Dummies", "1234567890", 2024, user1);
        //f = fantasyregal
        //104 = ebene 1, position 4 (von links nach rechts)
        Exemplar e1 = new Exemplar(01, "f03", 104);
        b1.addExemplar(e1);

        Buch b2 = new Buch("Umzingelt von Idioten", "69420", 2020, user2);
        Exemplar e2 = new Exemplar(01, "p07", 312);
        b2.addExemplar(e2);

        bib.addBuch(b1);
        bib.addBuch(b2);

        //Das erste Exemplar von "Java fuer Dummies" wird an Max Musternamm verliehen
        b1.exemplare[0].verleiheAn(user2);
        b2.exemplare[0].verleiheAn(user1);

        bib.print();

        //Aufgabe Nr.1: Bibliothek ausgeben

        //Aufgabe Nr.2: ".equals" implementieren
        /*System.out.println(b1.equals(b2));*/

        //Aufgabe Nr.3: Buch kopieren und ausgeben
        /*
        Buch buchkopie = b1.kopie();
        b1.print();
        buchkopie.print();
        System.out.println(b1.equals(buchkopie));
        */
        System.out.println("FERTIG");

    }

    public Bibliothek(String institutionsName, String standort){
        this.institutionsName = institutionsName;
        this.standort = standort;
    }

    public void addUser(User b){
        for(int i = 0; i < users.length; i++){
            if(users[i] == null){
                users[i] = b;
                break;
            }
        }
    }//end addUser

    public void addBuch(Buch b){
        for(int i = 0; i < buecher.length; i++){
            if(buecher[i] == null){
                buecher[i] = b;
                break;
            }
        }
    }//end addBuch

    public void print(){
        System.out.println("Institution: " + getInstitutionsName());
        System.out.println("Standort: " + setStandort());
        System.out.println("\n User:");
        //gibt alle User aus
        for(User u : users){
            if(u!=null){
                u.print();
            }
        }
        //Gibt alle Buecher mit deren Exemplaren aus
        System.out.println("\n Die Anzahl der Buecher betraegt:" + Buch.getCount());
        for(Buch b : buecher){
            if(b!=null){
                b.print();
                System.out.println("");
            }
        }
    }

    public void setInstitutionsName(String institutionsName){
        this.institutionsName = institutionsName;
    }
    public String getInstitutionsName(){
        return institutionsName;
    }
    public void setStandort(String standort){
        this.standort = standort;
    }
    public String setStandort(){
        return standort;
    }

}
