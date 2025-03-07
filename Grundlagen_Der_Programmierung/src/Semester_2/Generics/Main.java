package Semester_2.Generics;

public class Main {

    public static void main(String[] args) {
        Cache cache = new Cache();

        /*cache.add("bitchCoin");
        cache.add("dogeCoin");
        cache.add(2);

        System.out.println(cache.get(0));
        System.out.println(cache.get(2));

        cache.typenAusgeben();*/

        DoubleAddiere da = new DoubleAddiere();

        System.out.println(da.addiere(1, 2.5f)); //Strings als Input geht nicht!!
    }



}
