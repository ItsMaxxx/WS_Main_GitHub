package aufgaben;

public class ToString {

    public static void main(String[]args){

        Person p = new Person(25, "Max", "Mustermann");
        System.out.println(p); //Hätte ich die .toString() Methode nicht implementiert würde hier wie in nem Array
        // nur der Speicherort in Hex-Form ausgegeben werden.

    }

}

class Person{

    public int alter;
    public String vorname;
    public String nachname;


    public Person(int alter, String vorname, String nachname){
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString(){
        return "Person{" +
                "alter=" + alter +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }



}