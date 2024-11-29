package Semester_1.Vererbung_Aufgabenpaket;

public class SoccerPlayer extends Member implements Teamplayer{

    private String[] positionen = new String[3];

    public SoccerPlayer(String name, String nachname, String startDate){
        super(name, nachname, startDate);
        super.fee = 0;
        setFee();
    }

    @Override
    public void setFee(){
        super.fee += 10;
    }

    @Override
    public String[] getPosition() {
        return this.positionen;
    }

    @Override
    public boolean setPosition(String pos) {
        //Checken, ob es eine Position ist, die es gibt.
        if(!pos.equals(SoccerPlayerData.GOAL)
                && !pos.equals(SoccerPlayerData.MIDFIELDER)
                && !pos.equals(SoccerPlayerData.FORWARD)
                && !pos.equals(SoccerPlayerData.DEFENDER)){
            System.out.println("Diese Position gibt es nicht!");
            return false;
        }
        //Wechselt der Spieler zum GOAL, ist das die einzige Position, die er haben kann.
        if(pos.equals(SoccerPlayerData.GOAL)){
            for(int i = 0; i < this.positionen.length; i++){
                if(i == 0){
                    positionen[0] = pos;
                }else{
                    positionen[i] = null;
                }
            }
            return true;
        }
        //Wenn er nicht zum GOAL wechselt und diese Position nicht schon hat, kann er wechseln.
        for(int i = 0; i < positionen.length; i++) {
            if(positionen[i] == null){
                positionen[i] = pos;
                return true;
            }else if (positionen[i].equals(SoccerPlayerData.GOAL)) {
                System.out.println("Goalies duerfen nicht die Positionen wechseln!");
                return false;

            }else if(positionen[i].equals(pos)){
                System.out.println("Der Spieler hat bereits diese Position!");
                return false;
            }
        }
        System.out.println("Der Spieler hat bereits alle Positionen!");
        return false;
    }//end setPosition



}
