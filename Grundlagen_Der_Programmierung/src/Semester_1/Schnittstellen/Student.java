package Semester_1.Schnittstellen;

public class Student extends Person implements Studentendaten {
    
    public int status = MATRIKULIERT;
    
    public Student(String name, String nachname, String geschlecht){
        super(name, nachname, geschlecht);
    }
    
    public void matrikulieren(){
        this.status = MATRIKULIERT;
    }
    public void exmatrikulieren(){
        this.status = EXMATRIKULIERT;
    }
    
    @Override
    public int getStatus() {
        return status;
    }
    
    
}
