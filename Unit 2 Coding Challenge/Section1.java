/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge2
 * Course: ADEV-1003 (173118)
 * Section: 1
 * Date Created: Sep 19, 2018 10:00 AM
 * Last Updated: Sep 20, 2018 10:00 AM
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Section1
 {
 	public static void main (String [] args)
 	{
		Scanner scan = new Scanner (System.in);
		System.out.print ("type first word: ");
		String firstword = scan.nextLine();
		int leng1 = firstword.length();
		System.out.print ("type second word: ");
		String secondword = scan.nextLine();
		int leng2 = secondword.length();
		int shorter = Math.min(leng1,leng2);
		System.out.println ("shorter word: " + shorter);
	}
}
