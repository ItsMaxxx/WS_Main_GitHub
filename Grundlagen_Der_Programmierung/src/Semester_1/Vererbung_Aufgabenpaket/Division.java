package Semester_1.Vererbung_Aufgabenpaket;

public class Division implements DivisionData{

    Member[] members = new Member[100];
    int abteilungstyp;

    public Division(int abteilungstyp) {
        switch(abteilungstyp){
            case DivisionData.SOCCER:
                this.abteilungstyp = DivisionData.SOCCER;
                break;
            case DivisionData.HANDBALL:
                this.abteilungstyp = DivisionData.HANDBALL;
                break;
            case DivisionData.JUDO:
                this.abteilungstyp = DivisionData.JUDO;
                break;
            case DivisionData.BASKETBALL:
                this.abteilungstyp = DivisionData.BASKETBALL;
                break;
            default:
                System.out.println("Diese Abteilung gibt es nicht!");
                break;
        }
    }


    @Override
    public boolean addMember(Member m) {
        if(abteilungstyp == DivisionData.BASKETBALL && m instanceof BasketballPlayer){
            for(int i = 0; i < members.length; i++){
                if(members[i] == null){
                    members[i] = m;
                    return true;
                }
            }
        }else if(abteilungstyp == DivisionData.HANDBALL && m instanceof HandballPlayer){
            for(int i = 0; i < members.length; i++){
                if(members[i] == null){
                    members[i] = m;
                    return true;
                }
            }
        }else if(abteilungstyp == DivisionData.SOCCER && m instanceof SoccerPlayer){
            for(int i = 0; i < members.length; i++){
                if(members[i] == null){
                    members[i] = m;
                    return true;
                }
            }
        }else if(abteilungstyp == DivisionData.JUDO && m instanceof Judoka){
            for(int i = 0; i < members.length; i++){
                if(members[i] == null){
                    members[i] = m;
                    return true;
                }
            }
        }
        System.out.println("Der Member passt nicht zur Division!");
        return false;
    }

    @Override
    public Member[] getMember() {
        return members;
    }



}
