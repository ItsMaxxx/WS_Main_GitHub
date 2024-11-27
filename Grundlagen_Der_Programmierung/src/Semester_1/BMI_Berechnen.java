package aufgaben;

import java.util.Scanner;

public class BMI_Berechnen {

    public static void main(String[] args) {
        System.out.println("Hello " /*+ args[0]*/);
        
        bmi_berechnung();
    }

    public static void bmi_berechnung(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wie groß bist du in Zentimeter?");
        double height = scanner.nextDouble() / 100;
        System.out.println("Wieviel wiegst du in kg?");
        double gewicht = scanner.nextDouble();
        
        double bmi = gewicht / (height*height);
        
        String body = "";
        if(bmi<16){
            body = "Extremes Untergewicht";
        }else if(bmi<18.5){
            body = "Untergewicht";
        }else if(bmi<24){
            body = "Normalgewicht";
        }else if(bmi<30){
            body = "Übergewicht";
        }else if(bmi<35){
            body = "Adipositas I";
        }else if(bmi<40){
            body = "Adipositas Grad II";
        }else if(bmi>=40){
            body = "Adipositas Grad III";
        }
        System.out.println("Du hast ein BMI von " + bmi+ " und leidest an " + body);
        System.out.println("\tDas ist 2 Mal Tab");
    }
}