package Semester_2;

/**
 * Heyyy
 */
public class JavaDoc {

    /**
     * Konstruktor
     */
    public JavaDoc(){

    }

    /**
     *  Main-Methode
     * @param args:String[]
     */
    public static void main(String[] args) {
        //System.out.println(add(1.1,2.2));
        //arrays();
        //arrayKopie();
        System.out.println(polynom());
    }

    /**
     *Aufgabe Add-Methoden
     * @param a:double
     * @param b:double
     * @return a+b
     */
    public static double add(double a, double b){
        return a + b;
    }

    /**
     *Aufgabe Add-Methoden
     * @param a:int
     * @param b:int
     * @return a+b
     */
    public static int add(int a, int b){
        return a + b;
    }

    /**
     *Aufgabe Add-Methoden
     * @param a:long
     * @param b:long
     * @return a+b
     */
    public static long add(long a, long b){
        return a + b;
    }

    /**
     * Aufgabe Arrays
     */
    public static void arrays(){
        int[] array = new int[5];
        int[] array2 = {1, 2, 3, 4};
        Object[] objects = new Object[5];

        //Fürs erste Array
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        //Fürs zweite Array
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }

        //Fürs dritte Array
        for(Object object : objects){
            System.out.println(object);
        }

    }

    /**
     * Aufgabe Arrays Kopieren
     */
    public static void arrayKopie(){
        int[] array6 = {1, 2, 3, 0};
        int[] copy1 = new int[4];

        for(int i = 0; i < array6.length; i++){
            copy1[i] = array6[i];
        }

        for(int i : copy1){
            System.out.println(i);
        }
    }

    /**
     * Polynome berechnen
     * → Hab aus irgendeinem Grund das x überall entfernt xD
     * ALLES FALSCH!
     */
    public static String polynom(){
        String[] strings = {"2x15", "+", "2x7", "+", "x", "-", "5"};

        double current = 0;
        double zwischenspeicher = 0;
        String ergebnis = "";

        for(String string : strings){
            if(string.equals("x")){
                current += 1;
            }else if(string.contains("x")){
                String[] sss = string.split("x");
                zwischenspeicher = Math.pow(Integer.parseInt(sss[0]), Integer.parseInt(sss[1]));
            }else if(string.equals("+")){
                current += zwischenspeicher;
                zwischenspeicher = 0;
            }else if(string.equals("-")){
                current -= zwischenspeicher;
                zwischenspeicher = 0;
            }else{
                ergebnis += ergebnis.valueOf(current + string);
            }
        }
        return ergebnis;
    }



}
