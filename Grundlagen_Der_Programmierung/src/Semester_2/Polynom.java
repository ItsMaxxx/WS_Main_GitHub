package Semester_2;

public class Polynom {
    
    public int a;
    static{
        //Static initializer block or static initialization block, or static clause are some other names for the
        // static block. Static block code executes only once during the class loading. The static blocks always
        // execute first before the main() method in Java because the compiler stores them in memory at the time of
        // class loading and before the object creation.
        System.out.println("Die Klasse wurde geladen!!");
    }

    public static void main(String[] args){
        double[] poly1 = {1,1,0,2};
        
        //nichtOptimiert();
        //optimiert();
    }

    { //Instance block -> gut um default-werte zu uebergeben, wenn ein KOnstruktor ein paar variablen nicht nutzt
        //Static initializer blocks always execute before the instance initialization blocks because static blocks run
        // at the time of class loading. However, the instance block runs at the time of instance creation. The Java
        // compiler copies initializer blocks into every constructor. Therefore, multiple constructors can use this
        // approach to share a block of code
        System.out.println("Ein Objekt wurde erstellt!!");
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
