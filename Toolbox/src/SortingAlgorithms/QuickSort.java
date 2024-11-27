package SortingAlgorithms;

import java.util.Random;

public class QuickSort {
	
	//simply swaps the positions of 2 elements of an array
	public static void swap(int[] arr, int i, int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}//end swap
	
	/**
	 * Beschreibung ist oben.
	 * Damit die Methode einfacher aufgerufen werden kann, habe ich sie überladen.
	 * @param array
	 */
	public static int[] quickSort(int[] array) {
		int[] kopie = array;
		quickSort(kopie, 0, kopie.length - 1);
		array = kopie;
		return array;
	}//end quickSort

	   public static void quickSort(int[] arr, int lowIndex, int highIndex){
	    	
	    	if(lowIndex >= highIndex) {
	    		return;
	    	}
	    	
	        // pivot
	        int pivot = arr[highIndex];
	  
	        int leftPointer = partition(arr, lowIndex, highIndex, pivot);
	        swap(arr, leftPointer, highIndex);
	        
	        quickSort(arr, lowIndex, leftPointer - 1);
	        quickSort(arr, leftPointer + 1, highIndex);
	        
	    }
	   
	private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer){
			
			while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(arr,leftPointer,rightPointer);
		}
		return leftPointer;
	}
	
	public static void main(String[] args) {
		int[] ints = new int[100];
		
		Random rand = new Random();
		for(int i = 0; i<ints.length; i++) {
			ints[i] = rand.nextInt(100);
		}
		
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}//end for
		
		quickSort(ints);
		
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}//end for
	}//end main
	
}//end class