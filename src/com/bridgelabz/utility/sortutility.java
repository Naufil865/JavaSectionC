package com.bridgelabz.utility;

public class sortutility {

	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	  public static void MergeSort(String[] arr,int low,int high) {
		  if (low < high) {
				int mid = (low + high) / 2;
				// Sort first and second halves
				MergeSort(arr, low, mid);
				MergeSort(arr, mid + 1, high);

				merge(arr, low, mid, high);
			}
	}
	
	public static void merge(String[] arr,int  low,int mid,int high) {
		// Find sizes of two subarrays to be merged
				int n1 = mid - low + 1;
				int n2 = high - mid;

				/* Create temp arrays */
				String L[] = new String[n1];
				String R[] = new String[n2];

				/* Copy data to temp arrays */
				for (int i = 0; i < n1; ++i)
					L[i] = arr[low + i];
				for (int j = 0; j < n2; ++j)
					R[j] = arr[mid + 1 + j];

				/* Merge the temp arrays */

				// Initial indexes of first and second subarrays
				int i = 0, j = 0;

				// Initial index of merged subarry array
				int k = low;
				while (i < n1 && j < n2) {
					if (L[i].compareTo(R[j]) <= 0) {
						arr[k] = L[i];
						i++;
					} else {
						arr[k] = R[j];
						j++;
					}
					k++;
				}

				/* Copy remaining elements of L[] if any */
				while (i < n1) {
					arr[k] = L[i];
					i++;
					k++;
				}

				/* Copy remaining elements of R[] if any */
				while (j < n2) {
					arr[k] = R[j];
					j++;
					k++;
				}
	}
}
