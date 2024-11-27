package RandomStuffToRemember;

public class StringMethoden {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strA = "Lehrer, Schueler";
		String[] s = strA.split(", ");
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("\nHello there \nAnakin\n.");
		
		char[] a = strA.toCharArray();
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(strA.toLowerCase());
		System.out.println(strA.toUpperCase());
		
		System.out.println(strA.replace('r','x'));
		
		//index von der Stelle, an der der übergebene String passt - passt es 2 mal, 
		//wird der Index vom ersten mal übergeben
		int c = strA.indexOf("rer");
		//hier sucht er erst AB dem angegebenen index
		int b = strA.indexOf("rer", 5);
		System.out.println(c);
		System.out.println(b);
		//wie indexOf, sucht nur nach dem letzten Vorkommen vom angegebenen Teilstrings
		System.out.println(strA.lastIndexOf("rer"));
		//-----------------------------------------
		String age = "69420";
		int intAge = Integer.parseInt(age);
		double doubleAge = Double.parseDouble(age);
		
	}

}
