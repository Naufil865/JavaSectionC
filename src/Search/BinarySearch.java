package Search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class BinarySearch {

	public static void main(String[] args)throws FileNotFoundException {
		String[] strarr = null;
		java.io.File file = new File("/home/slot2/Desktop/ab.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		try 
		{
			while((str = br.readLine())!= null)
			{
				strarr = str.split(",");
			}
			System.out.println("Unsorted = ");
			for(int i = 0;i < strarr.length;i++) {
				System.out.println(strarr[i]);
			}
			Arrays.sort(strarr);
			System.out.println("Sorted = ");
			for(int i=0 ; i <strarr.length;i++)
			{
			System.out.println(strarr[i]);
			}
		}
			
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
	
		
	}


