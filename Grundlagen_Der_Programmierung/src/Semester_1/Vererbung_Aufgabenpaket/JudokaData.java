package Semester_1.Vererbung_Aufgabenpaket;

public interface JudokaData {

    String LEFT = "LEFT";
    String RIGHT = "RIGHT";
    String OGOSHI = "OGOSHI";
    String UCHIMATA = "UCHIMATA";
    String OSOTOGARI = "OSOTOGARI";
    String OUCHIGARI = "OUCHIGARI";

    void setSide(String side);
    String getSide();
    boolean setSpecial(String special);
    String[] getSpecial();

}
