/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_1
 * Course: ADEV-1003 (173118)
 * Section: Section_2.6.6
 * Date Created: Aug 29, 2018 8:00 PM
 * Last Updated: Aug 30, 2018 10:19 AM
 */
public class TheAverageOfIntegers
{
	public static void main( String [] args )
	{
		int num1 = 1, num2 = 7, num3 = 9, num4 = 34;
		double avg;

		//calculate the average
		avg = (num1 + num2 + num3 + num4)/ (double) 4;
		//output the average of integers 1, 7, 9, and 34
		System.out.println ("The average of integers 1, 7, 9, and 34 is " + avg);

	}
}