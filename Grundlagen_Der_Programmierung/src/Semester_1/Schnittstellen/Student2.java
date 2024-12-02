package Semester_1.Schnittstellen;

public class Student2 implements Personendaten, Studentendaten{
    
    protected String name;
    public int status = MATRIKULIERT;
    
    @Override //Studentendaten
    public int getStatus() {
        return status;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void matrikulieren() {
    
    }
    
    @Override
    public void exmatrikulieren() {
    
    }
    
    @Override
    public String getNachname() {
        return "";
    }
    
    @Override
    public String getGeschlecht() {
        return "";
    }
    
    @Override
    public void setGeschlecht(String str) {
    
    }
    
    //...
    
}
