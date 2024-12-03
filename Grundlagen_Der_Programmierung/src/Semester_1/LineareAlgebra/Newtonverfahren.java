package Semester_1.LineareAlgebra;

public class Newtonverfahren {
    
    public static void main(String[] args){
        
        double xn = 2;
        for(int i = 0; i < 3; i++){
            xn = xn - (f(xn)/ df(xn));
            System.out.println(xn);
        }
    }
    
    public static double f(double x){
        return Math.pow(x, 2) -3;
    }
    public static double df(double x){
        return 2*x;
    }
}
