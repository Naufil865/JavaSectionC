package StringandRegular;

import java.util.Scanner;

import com.bridgelabz.utility.RegularExpUtility;

public class RegularExpr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullname,mobile;
		
		System.out.println("Enter FullName : ");
		fullname = scanner.nextLine();
		System.out.println("Enter Mobile Number : ");
		mobile = scanner.next();
		RegularExpUtility.Message(fullname, mobile);
	}

}
