package Sort;


import com.bridgelabz.utility.sortutility;
public class MergeSort {

	public static void main(String[] args) {
		String[] str1 = {"sam","jhon","ali","pan"};
		String[] str = {"tom","hardy","dan","san","doom"};
		
		System.out.println("Unsorted Array :");
		
		sortutility.printArray(str);
		System.out.println();
		sortutility.MergeSort(str ,0,str.length-1);
		
		System.out.println("Soreted Array with merge Sort :");
		sortutility.printArray(str);

	}

}
