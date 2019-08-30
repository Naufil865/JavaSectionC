package Search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class abc {

	public static int bsearch(String[] strarr,String str)
	{
		int left = 0,right = strarr.length-1,mid,result;
		while(left<=right )
		{
			mid = left + (right - left)/2;
			result = str.compareTo(strarr[mid]);
			if(result == 0)
				return mid;
			if(result > 0)
				left = mid+1;
			else
				right = mid-1;
				
		}
		return -1;
	}
	
	public static void main(String[] args)throws FileNotFoundException {
		java.io.File file = new File("/home/slot2/Desktop/ab.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String[] strarr = null;
		String str;
		try
		{
			while((str=br.readLine())!=null)
			{
			
				strarr = str.split(",");
			}
			System.out.println("Unsorted");
			for(int i = 0 ; i<strarr.length;i++)
			{
				System.out.println(strarr[i]);
			}
			Arrays.sort(strarr);
			System.out.println("Sorted");
			for(int i =0 ; i <strarr.length;i++)
			{
				System.out.println(strarr[i]);
			}
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter word to be search :");
			str = sc.next();
			int result = bsearch(strarr,str);
			if(result == -1)
				System.out.println("Elemenet not present");
			else
				System.out.println("Element"+ str+ "found at index "+result);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
