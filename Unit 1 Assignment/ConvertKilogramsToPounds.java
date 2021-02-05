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
public class ConvertKilogramsToPounds
{
	public static void main( String [] args )
	{
		double num1 = 10, num2 = 50, num3 = 100;
		double result1, result2, result3;
		final double RATIO = 0.454;

		// 1 lb = 0.454 kg
		result1=num1 / RATIO;
		result2=num2 / RATIO;
		result3=num3 / RATIO;

		// convert 10, 50, and 100 kg to lb
		System.out.println (num1+" kg = "+ result1 +" lb");
		System.out.println (num2+" kg = "+ result2 +" lb");
		System.out.println (num3+" kg = "+ result3 +" lb");
	}
}