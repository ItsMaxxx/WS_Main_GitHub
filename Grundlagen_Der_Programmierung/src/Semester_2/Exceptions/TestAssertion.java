package Semester_2.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAssertion {
  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Zahl:");
    
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
      String str;
      while((str = reader.readLine()).length()<0){
        System.out.println(str+":");
        assert !str.contains(","):"Punkt ist ein Komma";
        assert !str.matches(".*[a-z].*"):"Keine Buchstaben!";
        assert str.matches("[-]?[0-9]+[.]?[0-9]"): "Kein Double!";
        double in = Double.parseDouble(str);
        double erg = Math.sqrt(in);
        System.out.println(erg+"\nEingabe:");
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
