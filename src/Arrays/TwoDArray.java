package Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.Arrays2D;

public class TwoDArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m,n;
		System.out.println("Enter No of Rows m : ");
		m = scanner.nextInt();
		System.out.println("Enter No of Cols n : ");
		n = scanner.nextInt();
		
		int a[][] =Arrays2D.arrayInt(m,n);
		double d[][] = Arrays2D.arrayDouble(m, n);
		String s[][] = Arrays2D.arrayBoolean(m, n);
		Arrays2D.display(a,d,s,m, n);
	
	}

}
