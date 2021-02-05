/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge2
 * Course: ADEV-1003 (173118)
 * Section: 2
 * Date Created: Sep 19, 2018 10:00 AM
 * Last Updated: Sep 20, 2018 10:00 AM
 */
 import java.util.Scanner;
 import java.text.DecimalFormat;
 public class Section3
 {
 	public static void main (String [] args)
 	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the test's maximum score: ");
		int maximumScore = scan.nextInt();
		System.out.print("Enter the first student's score: ");
		double firstScore = scan.nextDouble();
		System.out.print("Enter the second student's score: ");
		double secondScore = scan.nextDouble();
		System.out.print("Enter the third student's score: ");
		double thirdScore = scan.nextDouble();

		// Student's mark calculated by dividing their score by the test's maximum score
		double fS = firstScore / maximumScore;
		double sS = secondScore / maximumScore;
		double tS = thirdScore / maximumScore;

		DecimalFormat df = new DecimalFormat ("#0.00%");

		// The highest mark
		double higher = Math.max(fS,sS);
		double highest = Math.max(higher,tS);
		String formattedHighest = df.format(highest);

		// The lowest mark
		double lower = Math.min(fS,sS);
		double lowest = Math.min(lower,tS);
		String formattedLowest = df.format(lowest);

		// The mean average
		double mean = (fS + sS + tS)/ 3;

		System.out.println("The average mark is "+ df.format(mean));
		System.out.println("The lowest mark is "+ df.format(lowest));
		System.out.println("The highest mark is "+ df.format(highest));
	}
}