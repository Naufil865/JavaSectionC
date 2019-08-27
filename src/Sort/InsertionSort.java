package Sort;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		String arr[]= {"sam","jhon","dan","bob","kent","roy"};
		Utility.printArray(arr);
		System.out.println();
		Utility.InsertionSort(arr);
		System.out.println("Sorted array of String : ");
		Utility.printArray(arr);

	}

}
