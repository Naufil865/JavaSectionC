package StringandRegular;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		String str = "Old MacDonald had a farm ,\n"
				+ "E-I-E-I-O.\n"
				+ "And on his farm he had some %ANIMAL%,\n"
				+ "E-I-E-I-O.\n"
				+ "With a %SOUND%,%SOUND% here,\n"
				+ "And a %SOUND%,%SOUND% there,\n"
				+ "Here a %SOUND%,there a %SOUND %,\n"
				+ "Everywhere a %SOUND%,%SOUND%,\n";

		System.out.print(str);
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		String user;
		System.out.println("Please Enter String : ");
		user = scanner.next();
		
		if(user.equals("chick"))
		{
			str = str.replaceAll("ANIMAL", "Chicks");
			str = str.replaceAll("SOUND", "chick");
		}
		if(user.equals("duck"))
		{
			str = str.replaceAll("ANIMAL", "DUCK");
			str = str.replaceAll("SOUND","quack");
		}
		
		if(user.equals("turkey"))
		{
			str = str.replaceAll("ANIMAL", "Turkey");
			str = str.replaceAll("SOUND","gobble");
		}
		
		if(user.equals("cat"))
		{
			str = str.replaceAll("ANIMAL", "Cat");
			str = str.replaceAll("SOUND","meow,meow");
		}
		
		if(user.equals("mule"))
		{
			str = str.replaceAll("ANIMAL", "Mule");
			str = str.replaceAll("SOUND","Heehaw");
		}
		
		if(user.equals("dog"))
		{
			str = str.replaceAll("ANIMAL", "Dog");
			str = str.replaceAll("SOUND","bow wow");
		}
		
		if(user.equals("pig"))
		{
			str = str.replaceAll("ANIMAL", "Pig");
			str = str.replaceAll("SOUND","oink,oink");
		}
		if(user.equals("turtle"))
		{
			str = str.replaceAll("ANIMAL", "Turtle");
			str = str.replaceAll("SOUND","nerp,nerp");
		}
		if(user.equals("cow"))
		{
			str = str.replaceAll("ANIMAL", "Cow");
			str = str.replaceAll("SOUND","moo,moo");
		}
		System.out.println(str);
		
		scanner.close();
	}

}
