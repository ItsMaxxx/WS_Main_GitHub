package Semester_2;

public class GenericsTest {
    
    public static void main(String[] args) {
        stringValueMax("b", "c");
    }
    
    public static <T> T stringValueMax(T a, T b){
        T erg = a;
        if(a instanceof String) {System.out.println("String Strings");}
        if(a instanceof Integer) {System.out.println("Integer Strings");}
        if(a instanceof Double) {System.out.println("Double Strings");}
        
        if(a.toString().compareTo(b.toString()) > 0){
            erg = a;
        }else{
            erg = b;
        }
        return erg;
    }
    
}
