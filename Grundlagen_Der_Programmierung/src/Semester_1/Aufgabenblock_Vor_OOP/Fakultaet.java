package Semester_1.Aufgabenblock_Vor_OOP;

import java.util.Scanner;

public class Fakultaet {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println(fakultaetBerechnen(scan.nextInt()));
    }

    public static int fakultaetBerechnen(int input){
        int output = 1;

        for(int i = 1; i <= input; i++){
            output *= i;
        }
        return output;
    }
}
