package SearchingAlgorithms;

import java.util.ArrayList;

public class BinarySearch {
public int gesucht = 15;
public ArrayList<Integer> intsL = new ArrayList<Integer>();
public int[] intsA = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};

	public BinarySearch() {
		//binarySearchWithArray();
		intsL.add(10);
		intsL.add(20);
		intsL.add(30);
		intsL.add(40);
		intsL.add(50);
		intsL.add(60);
		intsL.add(70);
		intsL.add(80);
		intsL.add(90);
		intsL.add(100);
		//binarySearchWithArrayList();
	}
	
	public int binarySearchWithArray() {
		int first = 0;
		int last = intsA.length;

		while(first <= last) {
			int middle = (first+last)/2;
			if(intsA[middle] == gesucht) {
				//return intsA[middle];
				return middle;
			}else if(intsA[middle] < gesucht) {
				first = middle + 1;
			}else{
				last = middle - 1;
			}//end ifs
			//System.out.println(first+" "+last+" "+middle);
		}//end while
		return -1;
	}//end binarySearch
	
	public int binarySearchWithArrayList() {
		int first = 0;
		int last = intsL.size();
		
		while(first <= last) {
			int middle = first + ((last - first)/2);
			if(intsL.get(middle) == gesucht) {
				//return intsA[middle];
				return middle;
			}else if(intsL.get(middle) < gesucht) {
				first = middle + 1;
			}else{
				last = middle - 1;
			}//end ifs
			//System.out.println(first+" "+last+" "+middle);
		}//end while
		return -1;
	}//end binarySearch
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch bs1 = new BinarySearch();
		
		//int result = bs1.binarySearchWithArray();
		int result = bs1.binarySearchWithArray();
		
		if(result == -1) {
			System.out.println("Ist nicht im Array");
		}else {
		System.out.println(result);
		}//end if
	}//end main

}//end class
