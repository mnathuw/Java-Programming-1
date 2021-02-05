/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_3
 * Course: ADEV-1003 (173118)
 * Section: 49
 * Date Created: Sep 27, 2018 10:00 AM
 * Last Updated: Sep 27, 2018 12:00 AM
 */
import java.util.Scanner;

public class Ex49
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your web address: ");
		String webAddress = scan.next();
		int len = webAddress.length();
		String domainName = webAddress.substring(len-3,len);
		System.out.println(domainName);
		if (domainName.equals("gov"))
		{
				System.out.println("It is government web address.");
		}
		else if (domainName.equals("edu"))
		{
			System.out.println("It is university web address.");
		}
		else if (domainName.equals("com"))
		{
			System.out.println("It is business web address.");
		}
		else if (domainName.equals("org"))
		{
			System.out.println("It is an organization web address.");
		}
		else
		{
			System.out.println("It is a web address for another entity.");
		}
	}
}
