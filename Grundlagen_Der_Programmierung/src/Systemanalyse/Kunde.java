package Systemanalyse;

import java.util.ArrayList;
import java.util.Date;

public class Kunde {

  ArrayList<Konto> konten = new ArrayList<Konto>();

  private String name;
  private String nachname;
  private Adresse adresse;
  private Date geburtsdatum;
  private Date datumErsteKontoeroeffnung;
  private double habenszins;
  
  
  public Kunde(String name, String nachname, Adresse adresse, Date geburtsdatum) {
    this.name = name;
    this.nachname = nachname;
    this.adresse = adresse;
    this.geburtsdatum = geburtsdatum;
  }
  
  public Kunde(String name, String nachname, Adresse adresse, Date geburtsdatum, Date datumErsteKontoeroeffnung) {
    this.name = name;
    this.nachname = nachname;
    this.adresse = adresse;
    this.geburtsdatum = geburtsdatum;
    this.datumErsteKontoeroeffnung = datumErsteKontoeroeffnung;
  }
  
  public Kunde(String name, String nachname, Adresse adresse, Date datumErsteKontoeroeffnung, double habenszins) {
    this.name = name;
    this.nachname = nachname;
    this.adresse = adresse;
    this.datumErsteKontoeroeffnung = datumErsteKontoeroeffnung;
    this.habenszins = habenszins;
  }



  public void einzahlen(){
  
  }
  
  public void auszahlen(){
  
  }
  
  public void ersteEinzahlung(){
  
  }
  
  public void kontoAufloesen(){
  
  }
  
  @Override
  public String toString() {
    return "Kunde{" +
            "name='" + name + '\'' +
            ", nachname='" + nachname + '\'' +
            ", adresse=" + adresse +
            ", datumErsteKontoeroeffnung=" + datumErsteKontoeroeffnung +
            '}';
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getNachname() {
    return nachname;
  }
  
  public void setNachname(String nachname) {
    this.nachname = nachname;
  }
  
  public Adresse getAdresse() {
    return adresse;
  }
  
  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }
  
  public Date getDatumErsteKontoeroeffnung() {
    return datumErsteKontoeroeffnung;
  }
  
  public void setDatumErsteKontoeroeffnung(Date datumErsteKontoeroeffnung) {
    this.datumErsteKontoeroeffnung = datumErsteKontoeroeffnung;
  }
}
