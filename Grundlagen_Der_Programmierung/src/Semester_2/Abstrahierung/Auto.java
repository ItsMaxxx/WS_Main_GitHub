package Semester_2.Abstrahierung;

public class Auto extends Fahrzeug{
	
	public static void main(String[] args) {
		Auto a = new Auto("auto1", 5);
		System.out.println(a.getBremsweg());
	}
	
	Auto(String id, int anzahlPassagiere){
		super(id, anzahlPassagiere);
		System.out.println("Ein Auto wurde erstellt");
	}
	
	@Override
	void addPassenger(int i) {
		this.anzahlPassagiere += 1;
	}
	
	@Override
	public double getBremsweg() {
		return 12.5;
	}
	
	@Override
	public String toString() {
		return "Auto{" +
						"id='" + id + '\'' +
						"passagiere'" + anzahlPassagiere + '\'' +
						'}';
	}
}



