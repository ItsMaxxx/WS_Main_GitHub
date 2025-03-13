package Systemanalyse;

public class Girokonto extends Konto{

    private static double maximalerUeberzug;

    {
        switch (kontostand.getWaehrung().getId()){
            case 1:
                maximalerUeberzug = 50;
                break;
            case 6:
                maximalerUeberzug = 1000;
                break;
            default:
                throw new IllegalArgumentException("Unbekannte Währung");
        }

    }

    public Girokonto(Currency kontostand){
        super(kontostand);
    }

    public static double getMaximalerUeberzug() {
        return maximalerUeberzug;
    }

    public static void setMaximalerUeberzug(double maximalerUeberzug) {
        Girokonto.maximalerUeberzug = maximalerUeberzug;
    }
}
