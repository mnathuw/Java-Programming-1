/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Unit 1 - Coding Challenge
 * Course: ADEV-1003 (173118)
 * Section: 1
 * Date Created: Sep 05, 2018 10:00 AM
 * Last Updated: Sep 06, 2018 09:59 AM
 */
public class RainAmounts
{
	public static void main( String [] args )
	{
		int Camping_d1 = 3, Camping_d2 = 6, Camping_d3 = 5, Home = 26;
		double avg, dif1, dif2;

		//Calculates the average rain fall where Jamie was camping
		avg = (Camping_d1 + Camping_d2 + Camping_d3) / (double) 3;
		System.out.println ("The average rain fall where Jamie was camping is " + avg);

		//Calculates the difference in rain fall between where Jamie was camping and his home
		dif1 = Home - (Camping_d1 + Camping_d2 + Camping_d3);
		System.out.println ("The difference in rain fall between where Jamie was camping and his home is " + dif1);

		//Calculates the difference in rain fall between where Jamie was camping and his home, when the rain fall amounts when camping are doubled
		dif2 = (Camping_d1 + Camping_d2 + Camping_d3) * 2 - Home;
		System.out.println ("The difference in rain fall between wherea Jamie was camping and his home, when the rain fall amounts when camping are doubled is " + dif2);
	}
}