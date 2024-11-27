package SearchingAlgorithms;

import java.util.ArrayList;

public class LinearSearch {
public int[] ints = {2,6,3,87,9687,2123,45,345,567,32,54,58,324,754};
public ArrayList<Integer> intsL = new ArrayList<Integer>();
public int gesucht = 9687;
	
	LinearSearch(){
		intsL.add(2);
		intsL.add(6);
		intsL.add(87);
		intsL.add(9687);
		intsL.add(2123);
		intsL.add(45);
		intsL.add(345);
		intsL.add(567);
		intsL.add(32);
		intsL.add(54);
		intsL.add(58);
		intsL.add(324);
		intsL.add(754);
	}
	public int lineareSucheWithArray() {
	    for (int i = 0; i < ints.length; i++) {
	        if (ints[i] == gesucht) {
	            return i;
	        }
	    }
	    return -1;
	}
	public int lineareSucheWithArrayList() {
	    for (int i = 0; i < intsL.size(); i++) {
	        if (ints[i] == gesucht) {
	            return i;
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch ls1 = new LinearSearch();
		//int ergebnis = ls1.lineareSucheWithArray();
		int ergebnis = ls1.lineareSucheWithArrayList();
		System.out.println(ergebnis+1);
	}//end main
	
}
