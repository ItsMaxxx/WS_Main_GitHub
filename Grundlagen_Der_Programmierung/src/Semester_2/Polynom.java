package Semester_2;

public class Polynom {
    
    public int a;
    {
        //Hier kann man Variablen initialisieren bevor der Konstruktor ausgeführt wird
        a = 2;
    }
    
    
    public static void main(String[] args){
        double[] poly1 = {1,1,0,2};
        
        //nichtOptimiert();
        //optimiert();
    }
    
    public static double nichtOptimiert(double[] poly, int x){
        double erg = 0;
        for(int i = 0; i < poly.length; i++){
            erg += poly[i] * Math.pow(x, i);
        }
        return erg;
    }
    
    public static double optimiert(double[] poly, int x){
        
        
        return 1.0;
    }
    
    
}
