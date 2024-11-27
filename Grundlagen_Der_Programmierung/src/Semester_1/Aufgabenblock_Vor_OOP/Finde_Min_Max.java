package Semester_1.Aufgabenblock_Vor_OOP;

public class Finde_Min_Max {

    public static void main(String[] args) {
        int[] ints = {1, 4, 8, 23, 77, 2};

        int kleinste, groesste;

        kleinste = ints[0];
        for(int i = 1; i < ints.length; i++){
            if(ints[i] < kleinste){
                kleinste = ints[i];
            }
        }
        System.out.println(kleinste);

        groesste = ints[0];
        for(int i = 1; i < ints.length; i++){
            if(ints[i] > groesste){
                groesste = ints[i];
            }
        }
        System.out.println(groesste);
    }



}
