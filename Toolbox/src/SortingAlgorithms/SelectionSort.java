package SortingAlgorithms;

public class SelectionSort {
	public int[] ints = {323,34,287,76,23,45,865,17,145,456,23,687,624,354};
	public SelectionSort() {
		//selectedSort();
		selectionSort(ints);
		
		for(int i = 0; i<ints.length;i++) {
			System.out.println(ints[i]);
		}
	}
	
	//Sucht sich das kleinste Element des Arrays und setzt es an die erste Stelle.
	//Danach sucht es immer wieder das kleinste Element und setzt es an die nächste Stelle
	//des sortierten Teils des Arrays
	public int[] selectionSort(int[] ints) {
		int[] arr = ints;
		for(int i = 0; i < arr.length-1; i++) {
			
			int lowIndex = i;
			int lowValue = arr[lowIndex];
			
			//j = nächste Stelle -> lauf durch das Array 
			for(int j = i+1; j < arr.length; j++) {
				//finde das kleinste element
				if(arr[j] < lowValue) {
					lowIndex = j;
					lowValue = arr[lowIndex];
				}//end if
			}//end for2
			
			//Mit element an position i tauschen
			if(lowIndex != i) {
				arr[lowIndex] = arr[i];
				arr[i] = lowValue;
			}//end if
		}//end for
		ints = arr;
		return ints;
	}//end method
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		SelectionSort ss1 = new SelectionSort();
	}

}







