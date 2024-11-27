package aufgaben;

import java.util.Arrays;

public class ZweidimensionalesArray {

    public static int[][] intArray = {{100, 199, 200},{4, 5, 6},{7, 8, 9}};
    public static int[] summe = new int[intArray.length];

    public static void main(String[] args) {
        zweidimensionalesArrayAddieren(intArray);

        System.out.println(Arrays.toString(summe));

        for(int i = 0; i < summe.length; i++) {
            System.out.println("Kunde " + (i+1) + ": " + summe[i]);
        }
    }//end main

    public static void zweidimensionalesArrayAddieren(int[][] ints){
        for(int i = 0; i < ints.length; i++){

            for(int j = 0; j < ints[i].length; j++) {
                summe[i] += ints[i][j];
            }
        }
    }

}//end class
