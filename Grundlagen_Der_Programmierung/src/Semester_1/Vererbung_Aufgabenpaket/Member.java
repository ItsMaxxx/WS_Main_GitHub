package Semester_1.Vererbung_Aufgabenpaket;

abstract class Member {

    private String name;
    private String nachname;
    private String startDate;
    int fee = 0;

    public Member(String name, String nachname, String startDate){
        this.name = name;
        this.nachname = nachname;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getFee() {
        return fee;
    }

    abstract void setFee();

}
