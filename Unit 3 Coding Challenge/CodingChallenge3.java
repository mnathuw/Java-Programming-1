/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge3
 * Course: ADEV-1003 (173118)
 * Date Created: Sep 19, 2018 10:00 AM
 * Last Updated: Sep 20, 2018 10:00 AM
 */
import java.util.Scanner;

public class CodingChallenge3
{
	public static void main (String[] args)
	{
		int month;
		String season ="";
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the month you were born (1-12): ");
		month = scan.nextInt();
		if (month <=12 && month >=1)
		{
			switch (month)
			{
				case 1:
					season = "Winter";
					break;
				case 2:
					season = "Winter";
					break;
				case 3:
					season = "Spring";
					break;
				case 4:
					season = "Spring";
					break;
				case 5:
					season = "Spring";
					break;
				case 6:
					season = "Summer";
					break;
				case 7:
					season = "Summer";
					break;
				case 8:
					season = "Summer";
					break;
				case 9:
					season = "Autumn";
					break;
				case 10:
					season = "Autumn";
					break;
				case 11:
					season = "Autumn";
					break;
				case 12:
					season = "Winter";
					break;
			}
			System.out.print("You were born in ");
			System.out.println(season);
		}
		else
		{
			System.out.println("Invalid choice.");
		}
	}
}










