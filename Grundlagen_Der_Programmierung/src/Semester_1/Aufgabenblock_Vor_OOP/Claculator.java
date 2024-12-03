package Semester_1.Aufgabenblock_Vor_OOP;

import java.util.Scanner;

public class Claculator {

    public static void main(String[] args){
        berechnen();
    }

    public static void berechnen(){
        Scanner sc = new Scanner(System.in);
        double ergebnis = 0;

        System.out.println("Was ist die erste Variable?");
        double x = sc.nextDouble();

        System.out.println("Welchen Rechenoperator möchtest du nutzen?");
        String str = sc.nextLine();

        System.out.println("Was ist die zweite Variable?");
        double y = sc.nextDouble();

        if(str.equals("+")){
            ergebnis = x + y;
        }else if(str.equals("-")){
            ergebnis = x - y;
        }else if(str.equals("*")){
            ergebnis = x * y;
        }else if(str.equals("/")){
            ergebnis = x / y;
        }
        System.out.println(ergebnis);
    }




}
