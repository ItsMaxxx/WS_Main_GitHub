package Semester_1;

import java.util.Scanner;

public class Fakultaet {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int fakult = scanner.nextInt();
        int ergebnis = 1;

        for(int rechner = 1; rechner < fakult; rechner++){
            ergebnis *= rechner;
            rechner++;
        }
        System.out.println(ergebnis);
    }

}
