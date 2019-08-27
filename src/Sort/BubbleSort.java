package Sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Enter number of elements in array : ");
		num = scanner.nextInt();
		int arr[] = new int[num];
		int n = arr.length;
		
		for(int i=0; i < n ;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Array Taken ");
		System.out.println("Unsorted array");
		for(int i=0; i<n ; i++) {
			System.out.println(arr[i]);
		}
		for(int i =  0; i < n-1 ; i++) 
		{
			for(int j = 0; j < n-i-1 ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}				
			}			
		}
		System.out.println("Sorted Array by using Bubble sort");
		for(int i = 0 ; i<n;i++)
		{
			System.out.println(arr[i]);
		}
		scanner.close();
	}

}
