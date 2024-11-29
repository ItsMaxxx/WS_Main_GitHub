package Semester_1.Vererbung_Aufgabenpaket;

public class Judoka extends Member implements JudokaData{

    String side;
    String[] specials = new String[4];

    public Judoka(String name, String nachname, String startDate){
        super(name, nachname, startDate);
        super.fee = 0;
        setFee();
    }

    @Override
    public void setFee(){
        super.fee += 3;
    }

    @Override
    public void setSide(String side) {
        if(!side.equals(JudokaData.LEFT) && !side.equals(JudokaData.RIGHT)){
            System.out.println("Diese Seite gibt es nicht!");
        }else{
            this.side = side;
        }
    }

    @Override
    public String getSide() {
        return this.side;
    }

    @Override
    public boolean setSpecial(String special) {
        //Checken, ob es eine Position ist, die es gibt.
        if(!special.equals(JudokaData.OGOSHI)
                && !special.equals(JudokaData.OSOTOGARI)
                && !special.equals(JudokaData.OUCHIGARI)
                && !special.equals(JudokaData.UCHIMATA)){
            System.out.println("Diese Position gibt es nicht!");
            return false;
        }

        //Wenn er diese Position nicht schon hat, kann er wechseln.
        for(int i = 0; i < specials.length; i++) {
            if(specials[i] == null){
                specials[i] = special;
                return true;
            }else if(specials[i].equals(special)){
                System.out.println("Der Spieler hat bereits diese Position!");
                return false;
            }
        }
        System.out.println("Der Spieler hat bereits 2 specials!");
        return false;
    }

    @Override
    public String[] getSpecial() {
        return specials;
    }
}
