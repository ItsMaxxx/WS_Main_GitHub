package Semester_1.Vererbung_Aufgabenpaket;

public class HandballPlayer extends Member implements Teamplayer{

    String[] positionen = new String[2];

    public HandballPlayer(String name, String nachname, String startDate){
        super(name, nachname, startDate);
        super.fee = 0;
        setFee();
    }

    public void setFee(){
        super.fee += 5;
    }

    @Override
    public String[] getPosition() {
        return this.positionen;
    }

    @Override
    public boolean setPosition(String pos) {
        //Checken, ob es eine Position ist, die es gibt.
        if(!pos.equals(HandballPlayerData.CENTER)
                && !pos.equals(HandballPlayerData.LEFTBACK)
                && !pos.equals(HandballPlayerData.RIGHTBACK)
                && !pos.equals(HandballPlayerData.LEFTWING)
                && !pos.equals(HandballPlayerData.RIGHTWING)
                && !pos.equals(HandballPlayerData.GOAL)){
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
