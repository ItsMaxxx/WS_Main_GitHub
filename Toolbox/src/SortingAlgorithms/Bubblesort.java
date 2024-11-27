package SortingAlgorithms;

public class Bubblesort {
public static int[] ints = {323,34,287,76,23,45,865,17,145,456,23,687,624,354};	
	
	public static void swap(int[]ints, int i, int j) {
		int k = ints[i];
		ints[i] = ints[j];
		ints[j] = k;
	}
	
	//NBubbleSort halt
	public static void sortTheBubble(){
		for(int i = 0; i < ints.length; i++) {
			for(int j = 0; j < ints.length -1; j++) {
				if(ints[j] < ints[j+1]) {
					swap(ints, j, j+1);
				}//end if
			}//end for
		}//end for squared
	}//end BubbleSort
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortTheBubble();
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}

}
