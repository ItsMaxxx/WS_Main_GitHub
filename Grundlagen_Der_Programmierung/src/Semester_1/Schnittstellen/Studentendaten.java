package Semester_1.Schnittstellen;

interface Studentendaten {
    public static final int MATRIKULIERT = 1;
    public static final int EXMATRIKULIERT = 0;
    
    int getStatus();
    void matrikulieren();
    void exmatrikulieren();
    
    
}
