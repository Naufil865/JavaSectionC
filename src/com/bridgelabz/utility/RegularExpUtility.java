package com.bridgelabz.utility;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegularExpUtility {
	public static void Message(String fullname,String mobile)
	{
		String str;
		str = "Hello <<name>>,\n"
				+ "We have your full name as <<fullname>> in our system.\n"
				+ "your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any cllarification thank You Bridgelabz date.";
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date date = new Date();		
		String firstname = fullname.substring(0,fullname.indexOf(' '));
		String str1 = str.replaceAll("<<name>>", firstname);
		String str2 = str1.replaceAll("<<fullname>>",fullname);
		String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
		String str4 = str3.replaceAll("date",dateFormat.format(date));
	System.out.print(str4);
	}
}
