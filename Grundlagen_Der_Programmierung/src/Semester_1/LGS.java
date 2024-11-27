package aufgaben;

import java.util.Scanner;

public class LGS {



    public static void main(String[] args){

    loesung(3, 3);

    }

    public static void loesung(int anzahlGleichungen, int anzahlUnbekannte){
        Scanner sc = new Scanner(System.in);

        int[][] ints = new int[anzahlGleichungen][anzahlUnbekannte];

        for(int i = 0; i < anzahlGleichungen; i++){
            System.out.println("Geb die Unbekannten der Gleichung Nr.: " +(i+1)+ " an.");
            for(int ii = 0; ii < anzahlUnbekannte; ii++){
                ints[i][ii] = sc.nextInt();
            }
        }


        for(int i = 0; i< ints.length; i++){
            for(int ii = 0; ii < ints[i].length; ii++){
                System.out.println(ints[i][ii]);
            }
        }

    }



}
