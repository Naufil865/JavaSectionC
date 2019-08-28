package StringandRegular;

import java.util.Scanner;

import com.bridgelabz.utility.RegularExpUtility;

public class UserRegister {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RegularExpUtility utility = new RegularExpUtility();
		String fname,lname,email,phone,company,userid,password;
		System.out.println("Enter the First Name : ");
		fname = scanner.next();
	
		
		
		if(utility.isValidName(fname))
		{
			System.out.println("Enter the Last Name : ");
			lname = scanner.next();
			if(utility.isValidName(lname))
			{
				System.out.println("Enter the Email Address : ");
				email = scanner.next();
				if(utility.isEmail(email))
				{
					System.out.println("Enter Phone Number with +91********** : ");
					phone = scanner.next();
					if(utility.isPhone(phone))
					{
						System.out.println("Enter Company Name : ");
						company = scanner.next();
						System.out.println("Enter User ID  : ");
						userid = scanner.next();
						if(utility.isValidId(userid))
						{
							System.out.println("Enter Password : ");
							password = scanner.next();
							if(utility.isPassword(password))
							{
								System.out.println("Form Details : ");
								System.out.println("Your Name is "+fname+" "+lname);
								System.out.println("Email is "+email);
								System.out.println("Phone Number is "+phone);
								System.out.println("Company Name is "+company);
								System.out.println("User ID is "+ userid);
								System.out.println("Password is "+password);
							}
							else
								System.out.println("Enter valid password!!");
						}else
							System.out.println("Enter Valid User Id !!");
						
					}else
						System.out.println("Enter Valid Phone Number!!");
				}else
					System.out.println("Enter valid Email!!");
			}else
				System.out.println("Enter Valid LAst  Name!!");
		}else
			System.out.println("Enter Valid first name!!");
	}
		

}
