package Systemanalyse;

public class Adresse {
  
  private String strasse;
  private int hausnummer;
  private String plz;
  private String ort;
  private Land land;
  
  public Adresse(String strasse, int hausnummer, String plz, String ort, Land land) {
    this.strasse = strasse;
    this.land = land;
    this.hausnummer = hausnummer;
    this.plz = plz;
    this.ort = ort;
  }
  
  @Override
  public String toString() {
    return "Adresse{" +
            "strasse='" + strasse + '\'' +
            ", hausnummer=" + hausnummer +
            ", plz='" + plz + '\'' +
            ", ort='" + ort + '\'' +
            ", land=" + land +
            '}';
  }
  
  public String getStrasse() {
    return strasse;
  }
  
  public void setStrasse(String strasse) {
    this.strasse = strasse;
  }
  
  public int getHausnummer() {
    return hausnummer;
  }
  
  public void setHausnummer(int hausnummer) {
    this.hausnummer = hausnummer;
  }
  
  public String getPlz() {
    return plz;
  }
  
  public void setPlz(String plz) {
    this.plz = plz;
  }
  
  public String getOrt() {
    return ort;
  }
  
  public void setOrt(String ort) {
    this.ort = ort;
  }
  
  public Land getLand() {
    return land;
  }
  
  public void setLand(Land land) {
    this.land = land;
  }
}
