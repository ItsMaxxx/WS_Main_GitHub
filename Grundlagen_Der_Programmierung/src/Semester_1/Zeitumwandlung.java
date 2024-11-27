package aufgaben;

public class Zeitumwandlung {
    
    public static void main(String[] args){
        berechneZeit(37572);
    }
    
    //Man gibt eine Anzahl an Sekunden an; Es werden die Stunden und Minuten berechnet.
    public static void berechneZeit(int x){
        int minute = 60; //60 Sekunden
        int stunde = 3600; //3600 Sekunden in einer Stunde
        int restzeit = x;
        int anzahlStunden = 0;
        int anzahlMinuten = 0;
        
        if(x >= stunde){
            anzahlStunden = x / stunde;
            restzeit = x - (anzahlStunden * stunde);
        }
        if(x>=minute) {
            anzahlMinuten = restzeit / minute;
            restzeit = restzeit - (anzahlMinuten * minute);
        }
        
        System.out.println("Deine "+ x +" Sekunden wurden hierzu umgewandelt:");
        System.out.println("Stunden: " + anzahlStunden + "\nMinuten: " + anzahlMinuten + "\nSekunden: " + restzeit);
    }
    
    
}
