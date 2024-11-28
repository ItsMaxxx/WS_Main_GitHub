package Semester_1.Schnittstellen;

interface Personendaten {

    String MALE = "M"; //public static final
    String FEMALE = "F";

    String getName(); // public abstract
    String getNachname();
    String getGeschlecht();
    void setGeschlecht(String str);



}
