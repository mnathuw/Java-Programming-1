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
public class  TheCircumferenceOfACircle
{
	public static void main( String [] args )
	{
		final double PI = 3.14159;
		double r = 3.2;
		double C;

		//formula to calculate the circumfence of a circle
		C = r * 2 * PI;

		//output the circumference of a circle having a radius of 3.2 inches
		System.out.println ("The circumference of a circle having a radius of 3.2 inches is "+ C );
	}
}