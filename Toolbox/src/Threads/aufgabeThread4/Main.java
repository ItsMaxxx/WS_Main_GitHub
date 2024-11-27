package aufgabeThread4;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        zaehlThread zT1 = new zaehlThread();
        zT1.start();

        String inputText = "";
        String anzeigeText = "Bitte geben sie zum Beenden 'end' ein";
        inputText = JOptionPane.showInputDialog(anzeigeText);

        while(!inputText.equals("end")){
        }
        zT1.end = true;
        System.out.println("Runtime: " + zT1.timeInSekunden + " " + "Sekunden");
        zT1.stop();
    }

}
