/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_3
 * Course: ADEV-1003 (173118)
 * Section: 50
 * Date Created: Sep 27, 2018 10:00 AM
 * Last Updated: Sep 27, 2018 12:00 AM
 */
import java.util.Scanner;
public class Ex50
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your temperature: ");
		int temperature = scan.nextInt();
		if (temperature >= 90 && temperature <= 110)
		{
			System.out.println("It is probably summer.");
		}
		else if (temperature >= 70 && temperature < 90)
		{
			System.out.println("It is probably spring.");
		}
		else if (temperature >= 50 && temperature < 70)
		{
			System.out.println("It is probably fall.");
		}
		else if (temperature < 50 && temperature >= -5)
		{
			System.out.println("It is probably winter.");
		}
		else
		{
			System.out.println("Temperature entered is outside the valid range.");
		}
	}
}