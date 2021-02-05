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
public class Ex61
{
	public static void main (String [] args)
	{
		int max = 0, count = 0, avg = 0, num = 0;
		int min = 100;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your numbers (from 0 to 100): ");
		do
		{
			num = scan.nextInt();

			if (num >= 0 && num <= 100)
			{
					count++;
					avg += num;
					if (num < min)
					min = num;
					if (num > max)
					max = num;
			}
		}
		while ( count < 10);
		System.out.println("The max is "+ max);
		System.out.println("The min is "+ min);
		avg /= 10;
		System.out.println("The avg is "+ avg);
	}
}




