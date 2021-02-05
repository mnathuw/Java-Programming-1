/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_3
 * Course: ADEV-1003 (173118)
 * Section: 52
 * Date Created: Sep 27, 2018 10:00 AM
 * Last Updated: Sep 27, 2018 12:00 AM
 */
import java.util.Scanner;
public class Ex52
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your user ID: ");
		String userID = scan.nextLine();
		System.out.print("Enter your password: ");
		String password = scan.nextLine();

		if (userID.equals("admin")&&password.equals("open"))
		{
			System.out.println("Welcome.");
		}
		else if (userID.equals("admin")&&!password.equals("open"))
		{
			System.out.println("Wrong password.");
		}
		else if (!userID.equals("admin")&&password.equals("open"))
		{
			System.out.println("Wrong user ID");
		}
		else
		{
			System.out.println ("Sorry, wrong ID and password.");
		}
	}
}
