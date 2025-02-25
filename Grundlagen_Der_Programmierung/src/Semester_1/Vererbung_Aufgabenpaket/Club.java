package Semester_1.Vererbung_Aufgabenpaket;

public class Club {

    private Division[] divisionen = new Division[4];
    public Member[] members = new Member[400];

    public static void main(String[] args){

        /*Member sp = new SoccerPlayer("Peter", "Pan", "28.04.2008");
        /*System.out.println(sp.getFee());

        System.out.println(sp.setPosition("FORWARD"));
        //System.out.println(sp.setPosition("GOAL"));
        System.out.println(sp.setPosition("MIDFIELDER"));
        System.out.println(sp.setPosition("FORWARD"));

        for(int i = 0; i < sp.getPosition().length; i++){
            System.out.println(sp.getPosition()[i]);
        }*/

        //----------------------------------------------------------------

        Member hp = new HandballPlayer("Dieter", "Eckart", "11.09.2001");
        /*System.out.println(hp.getFee());

        System.out.println(hp.setPosition("CENTER"));
        System.out.println(hp.setPosition("RIGHTBACK"));

        for(int i = 0; i < hp.getPosition().length; i++){
            System.out.println(hp.getPosition()[i]);
        }*/

        //----------------------------------------------------------------

        /*Member bp = new BasketballPlayer("Gordon", "Ramsay", "69.420.2069");
        System.out.println(bp.getFee());

        System.out.println(bp.setPosition("CENTER"));
        System.out.println(bp.setPosition("POWERFORWARD"));

        for(int i = 0; i < bp.getPosition().length; i++){
            System.out.println(bp.getPosition()[i]);
        }*/

        //----------------------------------------------------------------

        Member j = new Judoka("Rudi", "Schmelzer", "12.34.2056");
        /*System.out.println(j.getFee());

        j.setSide("LEFT");
        j.setSide("MIDDLE");
        System.out.println(j.getSide());

        j.setSpecial("OGOSHI");
        j.setSpecial("UCHIMATA");
        j.setSpecial("OGOSHI");

        for(int i = 0; i < j.getSpecial().length; i++){
            System.out.println(j.getSpecial()[i]);
        }

        //----------------------------------------------------------------
        */
        Member bp = new BasketballPlayer("Gordon", "Ramsay", "11.09.2001");

        Division basketballDivision = new Division(DivisionData.BASKETBALL);
        System.out.println(basketballDivision.abteilungstyp);

        basketballDivision.addMember(bp);
    }

    public void addDivision(Division division) {
        for(int i = 0; i< divisionen.length; i++){
            if(divisionen[0] == null){
                divisionen[0] = division;
            }
        }
    }
    
    public Division[] getDivisionen() {
        return divisionen;
    }
    
    public Member[] getMembers() {
        return members;
    }
    
    public void printMembers(Member[] m){
        for(Member member : m){
            System.out.println("Name: " + member.getName() + " " + member.getNachname());
        }
    }
    
    public int getFee(){
        int sum = 0;
        for(Member member : members){
            sum += member.getFee();
        }
        return sum;
    }
    
}
