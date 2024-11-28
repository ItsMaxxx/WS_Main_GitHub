package Semester_1.Schnittstellen;

public class Person implements Personendaten{

    private String name;
    private String nachname;
    private String geschlecht;

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getNachname(){
        return nachname;
    }




}
