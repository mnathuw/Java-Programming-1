/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_3
 * Course: ADEV-1003 (173118)
 * Section: Section_3.18.7
 * Date Created: Sep 13, 2018 10:00 AM
 * Last Updated: Sep 13, 2018 12:00 AM
 */
import java.util.Scanner;
public class Ex67
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your sentence: ");
		String inputString = scan.nextLine();
		String reverseString = "";
		int len = inputString.length();
		for (int i = len - 1; i >= 0; i--)
		{
			reverseString+=inputString.charAt(i);
		}
		if (inputString.equals(reverseString))
		System.out.println("The string is a palindrome");
		else
		System.out.println("The string is not a palindrome");
	}
}