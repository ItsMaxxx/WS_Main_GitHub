package Semester_1.Aufgabenblock_Vor_OOP;

public class Bubblesort {
    
    public static void main(String[] args){
        double[] dArray12 = new double[12];
        for(int i = 0; i < dArray12.length; i++){
            dArray12[i] = (Math.random() * 100);
        }
        sortierung(dArray12);
        
        for(int i = 0; i < dArray12.length; i++){
            System.out.println(dArray12[i]);
        }
    }
    
    public static double[] sortierung(double[] intArray){
        for(int i=0; i<intArray.length; i++){
            for(int j=0; j<intArray.length-1; j++){
                if(intArray[j] < intArray[j+1]){
                    double a = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = a;
                }
            }
        }
        return intArray;
    }
}
