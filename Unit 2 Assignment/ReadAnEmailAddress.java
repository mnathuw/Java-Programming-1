/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_2
 * Course: ADEV-1003 (173118)
 * Section: Section_3.18.7
 * Date Created: Sep 13, 2018 10:00 AM
 * Last Updated: Sep 13, 2018 12:00 AM
 */
import java.util.Scanner;
public class ReadAnEmailAddress
{
	public static void main (String [] args)
	{
			Scanner scan = new Scanner(System.in);

			// 		Enter email address
		    System.out.println("Enter your email address:");
			String Email = scan.nextLine();
			int Sign = Email.indexOf('@');
			int len = Email.length();
			String Username = Email.substring (0, Sign);

			// 		Domain name does not include sign @ --> Sign + 1
			String Domainname = Email.substring (Sign + 1, len);

			// 		Print out username and domain name
			System.out.println("Your username is: " + Username);
			System.out.println("Your domain name is: " + Domainname);

	}
}