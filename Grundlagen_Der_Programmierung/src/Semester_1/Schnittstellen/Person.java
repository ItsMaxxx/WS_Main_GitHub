package Semester_1.Schnittstellen;

public class Person implements Personendaten{

    private String name;
    private String nachname;
    private String geschlecht;
    
    public Person(String name, String nachname, String geschlecht){
        this.name = name;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getNachname(){
        return nachname;
    }

    @Override
    public String getGeschlecht(){
        return geschlecht;
    }
    
    @Override
    public void setGeschlecht(String str){
        this.geschlecht = str;
    }

}
