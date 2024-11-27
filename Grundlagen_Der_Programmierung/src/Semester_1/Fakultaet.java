package Semester_1;

import java.util.Scanner;

public class Fakultaet {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int fakult = scanner.nextInt();
        int rechner = 1;
        int ergebnis = 1;

        for(int i = 0; i < fakult; i++){
            ergebnis *= rechner;
            rechner++;
        }
        System.out.println(ergebnis);
    }

}
