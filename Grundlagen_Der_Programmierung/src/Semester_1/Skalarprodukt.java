package Semester_1;

public class Skalarprodukt {
    
    public static void main(String[] args){

        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(-7, 8, 9);

        Vektor v3 = new Vektor(v1.werte);

        System.out.println(skalarprodukt(v1, v2));
    }
    
    public static int skalarprodukt(Vektor v1, Vektor v2){
        int ergebnis = 0;
        for(int i = 0; i < 3; i++){
            ergebnis +=  v1.werte[i] * v2.werte[i];
        }
        return ergebnis;
    }
    
}

class Vektor{
    int[] werte = new int[3];
    public Vektor(){}
    
    public Vektor(int x, int y, int z){
        this.werte[0] = x;
        this.werte[1] = y;
        this.werte[2] = z;
    }
    public Vektor(int[] array){
        this.werte = array;
    }
}
