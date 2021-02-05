/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge2
 * Course: ADEV-1003 (173118)
 * Section: 2
 * Date Created: Sep 19, 2018 10:00 AM
 * Last Updated: Sep 20, 2018 10:00 AM
 */
 public class Section2
 {
 	public static void main (String [] args)
 	{
		//Identifier Name and Initial Value
		String telephoneNumber = "5554545";
		String initialStringValue = "A String is an array of characters";
		String moreInformation = ", with some built in methods";
		String concatenatedString = "";

		//Print telephoneNumber to the console in the format - “555-4545"
		String threeFirstDigits = telephoneNumber.substring(0,3);
		int len = telephoneNumber.length();
		String fourLastDigits = telephoneNumber.substring(3,len);
		System.out.println("Telephone Number: " + threeFirstDigits + "-" + fourLastDigits);

		//Convert telephone number to an integer and store the result
		int telephoneNumber1 = Integer.parseInt(telephoneNumber);

		//Determine the length of the String initialStringValue and print the result to the console
		int len1 = initialStringValue.length();
		System.out.println("InitialStringValue length is: " + len1);

		//Append moreInformation to the end of initialStringValue. Store the result in concatenatedString and print the value to the console.
		concatenatedString = initialStringValue.concat(moreInformation);
		System.out.println("Concatenated: " + concatenatedString);

		//Determine the length of the String concatenatedString.
		//Print the result to the console.
		int len2 = concatenatedString.length();
		System.out.println("Concatenated length is: " + len2);

		//Using the Java API,find a method of the String class that will determine whether the String moreInformation ends with the String "ods”.
		//Print the result to the console.
		String s1 = concatenatedString.substring(len2 - 3, len2);
		String s2 = "ods";
		System.out.println("moreInformation ends with " + '"' + "ods" + '"' +": " + s1.equals(s2));

		//Using the Java API, find a method of the String class that will replace all instances of the character sequence “ar” with the character sequence “X-” in the String concatenatedString.
		//Print the result to the console
		String newConcatated = concatenatedString.replace("ar", "X-");
		System.out.println("Replaced text: " + newConcatated);
	}
}

