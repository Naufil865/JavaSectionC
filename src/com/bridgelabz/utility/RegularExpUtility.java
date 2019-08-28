package com.bridgelabz.utility;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
	
	public boolean isValidName(String fname)
	{
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		Matcher match = pattern.matcher(fname);
		return match.matches();
	}
	
	public boolean isEmail(String email)
	{
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher match = pattern.matcher(email);
		return match.matches();
	}
	public boolean isPhone(String phone)
	{
		Pattern pattern = Pattern.compile("^\\+(?:[0-9]?){6,14}[0-9]$");
		Matcher match = pattern.matcher(phone);
		return match.matches();
	}
	public boolean isValidId(String userid)
	{
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
		Matcher match = pattern.matcher(userid);
		return match.matches();
	}
	public boolean isPassword(String password)
	{
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{8,16})");
		Matcher match = pattern.matcher(password);
		return match.matches();
	}

	
}
