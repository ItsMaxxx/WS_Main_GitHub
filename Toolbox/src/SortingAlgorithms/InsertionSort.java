package SortingAlgorithms;

public class InsertionSort {
	public int[] ints = { 323, 34, 287, 76, 23, 45, 865, 17, 145, 456, 23, 687, 624, 354 };

	public InsertionSort() {
		insertTheSort();
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}// end constructor

	// Im Grunde wie BubbleSort. Wenn ein Element sortiert wird, wird es
	// mit den Stellen davor verglichen bis es an der Richtigen Stelle angekommen
	// ist,
	// sodass es nicht nochmal sortiert werden muss.
	public void insertTheSort() {
		for (int i = 1; i < ints.length; i++) {
			int toSort = ints[i];

			// Move element to the left until its at the right position
			int j = i;
			while (j > 0 && toSort < ints[j - 1]) {
				// Bsp.: Stelle 5 = Stelle 4
				ints[j] = ints[j - 1];
				// Stelle--; (Stelle 4)
				j--;
			}
			// Stelle 4 = Stelle 5
			ints[j] = toSort;
		}

	}// end method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		InsertionSort ins1 = new InsertionSort();
	}

}
