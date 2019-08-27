package Search;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = {2,5,1,4,3,6,9,8,7,10};
		Arrays.parallelSort(arr);
		
		System.out.println("Enter the Number to be Find = ");
		int num = scanner.nextInt();
		int index = Utility.BinarySearchInteger(arr, num);
		if(index == -1)
		{
			System.out.println("Number can not be Found !!");
		}else
		{
			System.out.println("Number Found at Index : "+index);
		}
		
		scanner.close();
	}

}
