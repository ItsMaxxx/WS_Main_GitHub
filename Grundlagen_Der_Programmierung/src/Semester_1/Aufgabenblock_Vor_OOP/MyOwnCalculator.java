package Semester_1.Aufgabenblock_Vor_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class MyOwnCalculator {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Double> dblArray = new ArrayList<Double>();
    public static ArrayList<String> strArray = new ArrayList<String>();
    public static double ergebnis = 0;
    
    public static void main(String[] args){
        
        String input = scan.nextLine();
        calculate(input);
        System.out.println(ergebnis);
        /*for(int i = 0; i < dblArray.size(); i++){
            System.out.println(dblArray.get(i));
        }*/
        
        //System.out.println(actualCalculator(1.0, 2.7, "+"));
        
        
    }
    
    public static void calculate(String str){
        char[] charArray = str.toCharArray();
        
        for(int i = 0; i < charArray.length; i++){
            if(!Character.isDigit(charArray[i])) {
                if(charArray[i] == '.'){
                    //Nichts. Das heißt nur, dass es eine Kommazahl ist.
                    //Durch Double automatisch gelöst ;)
                }else if (charArray[i] == '+') {
                    String s = "";
                    for(int ii = 0; ii < i; ii++){
                        s += charArray[ii];
                    }
                    ergebnis += Double.parseDouble(s);
                    for(int ii = i; ii < charArray.length; ii++){
                        s += charArray[ii];
                    }
                    //calculate(s);
                    
                }/*else if (charArray[i] == '-') {
                    String s = "";
                    for(int ii = 0; ii < i; ii++){
                        s += charArray[ii];
                    }
                    double ersteZahl = Double.parseDouble(s);
                    s = "";
                    for(int ii = i+1; ii < charArray.length; ii++){
                        s += charArray[ii];
                    }
                    double zweiteZahl = Double.parseDouble(s);
                    return ersteZahl - zweiteZahl;
                }else if (charArray[i] == '*'){
                    String s = "";
                    for(int ii = 0; ii < i; ii++){
                        s += charArray[ii];
                    }
                    double ersteZahl = Double.parseDouble(s);
                    s = "";
                    for(int ii = i+1; ii < charArray.length; ii++){
                        s += charArray[ii];
                    }
                    double zweiteZahl = Double.parseDouble(s);
                    return ersteZahl * zweiteZahl;
                }else if(charArray[i] == '/'){
                    String s = "";
                    for(int ii = 0; ii < i; ii++){
                        s += charArray[ii];
                    }
                    double ersteZahl= Double.parseDouble(s);
                    s = "";
                    for(int ii = i+1; ii < charArray.length; ii++){
                        s += charArray[ii];
                    }
                    double zweiteZahl = Double.parseDouble(s);
                    return ersteZahl / zweiteZahl;
                }*/
            
            }
        }
    }
    
    public static double calculate2(String str){
        char[] charArray = str.toCharArray();
        
        for(int i = 0; i < charArray.length; i++){
            if(!Character.isDigit(charArray[i])) {
            
            }
        }
        
        return 2;
    }
    
    
    
    
    
    
    
    
    
    
    public static double actualCalculator(double d1, double d2, String operator){
        if(operator.equals("+")){
            return d1 + d2;
        }else if(operator.equals("-")){
            return d1 - d2;
        }else if(operator.equals("*")){
            return d1 * d2;
        }else if(operator.equals("/")){
            return d1 / d2;
        }else{
            System.out.println("Diesen Operator habe ich noch nicht definiert ; )");
        }
        return 0.0;
    }
    
    
}
