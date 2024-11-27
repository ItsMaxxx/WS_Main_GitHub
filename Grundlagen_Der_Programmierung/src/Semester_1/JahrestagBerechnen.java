package aufgaben;

import java.util.Scanner;

public class JahrestagBerechnen {

    public static void main(String[] args) {
        tagBerechnen();
    }
    
    public static void tagBerechnen(){
        Scanner scan = new Scanner(System.in);
        int[] monate ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] gesuchterTagArray = {"Mo","Di","Mi","Do","Fr","Sa","So"};
        int jahr;
        int monat;
        int monatZwei;
        int tag;        //1 - 7 Mo bis So
        int ersterTag;  //erster Tag des Jahres 1 für Mo 7 für Di
        int absolut = 0;
        int rest;
        
        System.out.println("Jahr?");
        jahr = scan.nextInt();
        System.out.println("Monat?");
        monat = scan.nextInt() - 1;
        System.out.println("Tag");
        tag = scan.nextInt();
        System.out.println("Erster Tag des Jahres");
        ersterTag = scan.nextInt();
        monatZwei = monat;
        
        if (jahr % 4 == 0){
            monate[1] = 29;
        }
        
        while (monat > -1){
            absolut += monate[monat];
            monat--;
            System.out.println(absolut);
        }
        absolut=absolut-monate[monatZwei]+tag;
        System.out.println(absolut);
        absolut+= ersterTag -1;
        rest = absolut%7;
        System.out.println(rest);
        System.out.println(gesuchterTagArray[rest]);
        
    }//end tagBerechnen
    
}//end class
