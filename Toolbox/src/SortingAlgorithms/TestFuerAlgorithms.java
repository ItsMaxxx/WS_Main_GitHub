package SortingAlgorithms;

import java.util.Random;

public class TestFuerAlgorithms {

	public static void swap(int[] ints, int i, int j) {
		int k = ints[i];
		ints[i] = ints[j];
		ints[j] = k;
	}// end swap

	public static int[] bubbleSort(int[] arr) {
		
		return arr;
	}

	public static int[] selectionSort(int[] arr) {
		
		return arr;
	}

	public static int linearSearch(int[] ints, int suchwert) {
		
		return -1;
	}

	public static int binarySearch(int[] ints, int suchwert) {
		
		return -1;
	}// end binarySearch

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		@SuppressWarnings("unused")
		int suchwert = 69;
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		//sortieren

		int ergebnis = (7 - 8) + (6 + 12);
		System.out.println("Hier ist das Ergebnis: \n"+ergebnis);
		
		//suchen
		
	}

}
