package Semester_2.Generics;

public class GenericsTest {

    public static void main(String[] args) {
        System.out.println(stringValueMax(2, 3));
    }

    public static <T> T stringValueMax(T a, T b) {
        T erg = a;
        if(a instanceof String) {System.out.println("A ist Typ String");}
        if(a instanceof Integer) {System.out.println("A ist Typ Integer");}
        if(a instanceof Double) {System.out.println("A ist Typ Double");}

        if(b instanceof String) {System.out.println("B ist Typ String");}
        if(b instanceof Integer) {System.out.println("B ist Typ Integer");}
        if(b instanceof Double) {System.out.println("B ist Typ Double");}

        if (a.toString().compareTo(b.toString()) > 0) {
            erg = a;
        } else {
            erg = b;
        }

        if(a instanceof String) {System.out.println("erg:String");}
        if(a instanceof Integer) {System.out.println("erg:Integer");}
        if(a instanceof Double) {System.out.println("erg:Double");}

        return erg;
    }


}