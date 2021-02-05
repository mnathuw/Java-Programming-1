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
public class TheFutureValueOfInvestment
{
	public static void main (String [] args)
	{
			Scanner scan = new Scanner(System.in);

		    //     Enter your investment
		    System.out.println("Enter your investment");
			int Investment = scan.nextInt();

			//		Enter your interest rate
			System.out.println("Enter your interest rate:");
			double InterestRate = scan.nextDouble();

			// 		Expect the user to enter a number in decimal format
			DecimalFormat df = new DecimalFormat ("#0.##%");
			String formattedPercent = df.format(InterestRate);
			System.out.println (df.format(InterestRate));

			//		Formula future value
			double FV5 = Investment * Math.pow((1 + InterestRate), 5);
			double FV10 = Investment * Math.pow((1 + InterestRate), 10);
			double FV20 = Investment * Math.pow((1 + InterestRate), 20);

			//		Print out results
			DecimalFormat df1 = new DecimalFormat ("$#0.00");
			String FutureValue5 = df1.format(FV5);
			System.out.println("The future value of the investment in 5 years: " + FutureValue5);
			DecimalFormat df2 = new DecimalFormat ("$#0.00");
			String FutureValue10 = df2.format(FV10);
			System.out.println("The future value of the investment in 10 years: " + FutureValue10);
			DecimalFormat df3 = new DecimalFormat ("$#0.00");
			String FutureValue20 = df3.format(FV20);
			System.out.println("The future value of the investment in 20 years: " + FutureValue20);

	}
}