package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	public static void magicNumber(int range)
	{
		Scanner scanner = new Scanner(System.in);
		int lo = 0;
		int hi = range - 1;
		int mid = (lo + hi) / 2;
		System.out.println();
		System.out.println("Think of number in Mind between 0 and  "+ hi);
		
		while(lo < hi) 
		{
			System.out.println("If the number is between "+ lo + " to "+ mid +"  Press 1 ");
			System.out.println("If the number is between "+ (mid+1) + " to "+ hi +"  Press 2 ");
			int uservalue = scanner.nextInt();
			
			if(uservalue == 1)
			{
				hi = mid;
				mid = (lo + hi)/2;
			}
			else if(uservalue == 2)
			{
				lo = mid+1;
				mid = (lo + hi)/2;		
			}
			else
			{
				System.out.println("Wrong Input!!");
			}
		}
		System.out.println("Your Number is "+mid);
		scanner.close();
	}
	
	public static int BinarySearchInteger(int arr[],int num)
	{
		int start=0, end = arr.length-1, mid;
		while(start < end)
		{
			mid = start + (end - start)/2;
			
			if(arr[mid] == num)
				return mid;
			
			if(arr[mid] < num)
				start = mid+1;
			else
				end = mid -1;
		}
		return -1;
		
	} 
	public static void printArray(String arr[])
	{
		for(int i = 0; i < arr.length-1 ; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
	
	public static String[] InsertionSort(String[] arr)
	{
		int n = arr.length;
		String key;
		for(int i = 0; i < n ; i++)
		{
			for(int j = i + 1; j < n ;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					key = arr[i];
					arr[i] = arr[j];
					arr[j] = key;
				}
			}
		}
		return arr;
	}
	
	public static void frequencyCount(String strarr[])
	{
		sortutility.MergeSort(strarr, 0, strarr.length-1);
		//InsertionSort(strarr);
		System.out.println("Sorted Array Using MergeSort : ");
		printArray(strarr);
		System.out.println();
		
		int count = 1, j =0;
		for(int i=0 ; i<strarr.length-2;i++)
		{
			j++;
			if(strarr[i].equals(strarr[i+1]))
			{
				count++;
			}
			else
			{
				System.out.print("Key : "+strarr[i]+" Value :"+ count);
				System.out.println();
				count = 1;
			}
		}
		if(strarr[j].equals(strarr[j+1]))
		{
			count++;
			System.out.println("Key : "+ strarr[j]+"Value :"+ count + "" );
		}
	}
	
}
