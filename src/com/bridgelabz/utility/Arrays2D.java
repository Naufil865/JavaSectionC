package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Arrays2D {
	static Scanner scanner = new Scanner(System.in);
	public static int[][] arrayInt(int m , int n)
	{
		
		int a[][] = new int[m][n];
		System.out.println("Integer Array");
		
		for(int i = 0;i < m ;i++)
		{
			for(int j = 0; j < n ;j++)
			{
				a[i][j] = scanner.nextInt();
			}
		}
		return a;
		
	}
	public static double[][] arrayDouble(int m,int n)
	{
		double d[][] = new double[m][n];
		System.out.println("Double Array");

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				d[i][j] = scanner.nextDouble();
			}
		}
		return d;
	}
	
	public static String[][] arrayBoolean(int m,int n)
	{
		String s[][] = new String[m][n];
		System.out.println("Boolean Array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				s[i][j] = scanner.nextLine();
			}
		}
		return s;
	}
	
	public static void display(int[][]a,double[][]d,String[][]s,int m,int n)
	{
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("2D Array of Integer");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print("\t" +a[i][j] +" ");
			}
			pw.println("\t");
		}
		
		System.out.println();
		pw.println("2D Array of Double");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print("\t" + d[i][j] +" ");
			}
			pw.println("\t");
		}
		
		System.out.println();
		pw.println("2D Array of Boolean");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print("\t"+s[i][j]+" ");
			}
			pw.println("\t");
		}
	
	}
	
	
}
