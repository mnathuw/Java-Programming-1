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
public class Ex60
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your website list: ");
		String website = scan.nextLine();
		int len = website.length();
		String domainName = website.substring(len-4);
		int count = 0;
		while (!website.equals("stop"))
		{
			if (domainName.equals(".com"))
			count+=1;
			website = scan.nextLine();
			len = website.length();
			domainName = website.substring(len-4);
		}
		System.out.println(count);
	}
}