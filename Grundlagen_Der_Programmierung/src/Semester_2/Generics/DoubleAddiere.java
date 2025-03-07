package Semester_2.Generics;

public class DoubleAddiere<T extends Number>{

    public DoubleAddiere() {
    }

    public double addiere(T a, T b){
        return Double.parseDouble(a.toString()) + b.doubleValue(); //Beide Methoden funktionieren
    }


}
