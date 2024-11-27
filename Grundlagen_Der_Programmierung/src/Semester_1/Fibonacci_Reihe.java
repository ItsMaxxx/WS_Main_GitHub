package Semester_1;

import java.util.Scanner;

public class Fibonacci_Reihe  {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchtest du sehen?");
        int anzahlZahlen = scanner.nextInt();

        int start = 0;
        int start2 = 1;
        int ergebnis;

        System.out.println(0);
        System.out.println(1);
        for(int i = 0; i < anzahlZahlen-2; i++){
            ergebnis = start + start2;
            start = start2;
            start2 = ergebnis;
            System.out.println(ergebnis);
        }


    }
}