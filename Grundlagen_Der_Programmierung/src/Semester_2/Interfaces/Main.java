package Semester_2.Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //personMethode();
        anderePersonMethode();

    }

    public static void personMethode(){
        ArrayList<Person> personen = new ArrayList<Person>();

        personen.add(new Person("Heinz", "Peter", 12345));
        personen.add(new Person("Friedrich", "Merz", 12345));
        personen.add(new Person("Obama", "Schmerz", 12345));

        personen.sort(Comparator.comparing(Person::getVorname)
                .thenComparing(Person::getNachname));
        //Collections.reverse(personen);

        for(Person current : personen){
            System.out.println(current.toString());
        }
    }

    public static void anderePersonMethode(){
        ArrayList<ComparablePerson> personen = new ArrayList<ComparablePerson>();

        personen.add(new ComparablePerson("Heinz", "Peter", 12345));
        personen.add(new ComparablePerson("Friedrich", "Merz", 13346));
        personen.add(new ComparablePerson("Obama", "Schmerz", 12845));

        Collections.sort(personen);

        for(ComparablePerson current : personen){
            System.out.println(current.toString());
        }
    }

}
