/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Assignment_1
 * Course: ADEV-1003 (173118)
 * Section: Section_2.6.7
 * Date Created: Aug 29, 2018 8:00 PM
 * Last Updated: Aug 30, 2018 10:19 AM
 */
public class ConvertInchesToMillimeters
{
	public static void main( String [] args )
	{
		int num1 = 2, num2 = 5, num3 = 10;
		double result1, result2, result3;
		final double RATIO = 25.4;
			//1 inch = 25.4 mm
			result1 = num1 * RATIO;
			result2 = num2 * RATIO;
			result3 = num3 * RATIO;
				//convert 2, 5, and 10 inches to millimeters
				System.out.println (num1+" inches = "+ result1 +" mm");
				System.out.println (num2+" inches = "+ result2 +" mm");
				System.out.println (num3+" inches = "+ result3 +" mm");
	}
}