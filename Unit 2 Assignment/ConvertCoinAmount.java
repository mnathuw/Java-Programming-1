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
import java.text.DecimalFormat;
public class ConvertCoinAmount
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);

		    //		Enter the total nickel amount to dollars
		    System.out.println("Enter your nickel amount:");
			int num1 = scan.nextInt();

		    //		1 nickel = $0.05
		    double result1 = num1 * 0.05;
			DecimalFormat df1 = new DecimalFormat ("$#0.00");
			String Result1 = df1.format(result1);
			System.out.println(num1 +" nickels = " + Result1);

			//		Enter the total dime amount to dollars
			System.out.println("Enter your dime amount:");
			int num2 = scan.nextInt();

			//		1 dime = $0.10
			double result2 = num2 * 0.10;
			DecimalFormat df2 = new DecimalFormat ("$#0.00");
			String Result2 = df2.format(result2);
			System.out.println(num2 +" dimes = " + Result2);

			//		Enter the total quarter amount to dollars
			System.out.println("Enter your quarter amount:");
			int num3 = scan.nextInt();

			//		1 quarter = $0.25
			double result3 = num3 * 0.25;
			DecimalFormat df = new DecimalFormat ("$#0.00");
			String Result3 = df.format(result3);
			System.out.println(num3 +" quarters = "+ Result3);

			double finalresult = result1 + result2 + result3;
			DecimalFormat df4 = new DecimalFormat ("$#0.00");
			String FinalResult = df4.format(finalresult);
			System.out.println("The total amount of dollar is: " + FinalResult);

	}
}