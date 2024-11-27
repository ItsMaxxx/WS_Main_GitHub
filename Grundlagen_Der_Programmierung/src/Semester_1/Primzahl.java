package aufgaben;

import java.util.Scanner;

public class Primzahl {
    
    public static void main(String[] args){
        //int zahl = (int) Math.random() * 100;
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        
        if(istEinePrimzahl(zahl)){
            System.out.println(zahl + " ist eine Primzahl");
        }else{
            System.out.println(zahl + " ist keine Primzahl");
        }
    }
    
    public static boolean istEinePrimzahl(int zahl){
        boolean primzahl = true;
        for(int i = 2; i < zahl/2; i++){
            if(zahl%i == 0) {
                primzahl = false;
            }
        }
        return primzahl;
    }
    
}
