package Semester_1.Vererbung_Aufgabenpaket;

public class BasketballPlayer extends Member implements Teamplayer{

    String[] positionen = new String[4];

    public BasketballPlayer(String name, String nachname, String startDate){
        super(name, nachname, startDate);
        super.fee = 0;
        setFee();
    }

    public void setFee(){
        super.fee += 7;
    }

    @Override
    public String[] getPosition() {
        return this.positionen;
    }

    public boolean setPosition(String pos) {
        //Checken, ob es eine Position ist, die es gibt.
        if(!pos.equals(BasketballPlayerData.CENTER)
                && !pos.equals(BasketballPlayerData.POINTGUARD)
                && !pos.equals(BasketballPlayerData.POWERFORWARD)
                && !pos.equals(BasketballPlayerData.SMALLFORWARD)){
            System.out.println("Diese Position gibt es nicht!");
            return false;
        }

        //Wenn er diese Position nicht schon hat, kann er wechseln.
        for(int i = 0; i < positionen.length; i++) {
            if(positionen[i] == null){
                positionen[i] = pos;
                return true;
            }else if(positionen[i].equals(pos)){
                System.out.println("Der Spieler hat bereits diese Position!");
                return false;
            }
        }
        System.out.println("Der Spieler hat bereits 2 Positionen!");
        return false;
    }





}
