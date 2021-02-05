/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge_3
 * Course: ADEV-1003 (173118)
 * Section: 1
 * Date Created: Oct 03, 2018 10:00 AM
 * Last Updated: Oct 03, 2018 12:00 AM
 */
import java.util.Random;
import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args)
	{
		int playerChoice, computerChoice;
		int matchResult = 0; // 0 - draw // 1 - player win // 2 - com win
		Scanner scan = new Scanner(System.in);
		String playerChoiceName = "", computerChoiceName = "";
		System.out.print("Enter your choice (1 - Rock, 2 - Paper, 3 - Scissors): ");
		playerChoice = scan.nextInt();
		computerChoice = new Random().nextInt(3) + 1;

		if (playerChoice >=1 && playerChoice <=3)
		{
			switch (playerChoice)
			{
			case 1:
				playerChoiceName = "Rock";
				break;
			case 2:
				playerChoiceName = "Paper";
				break;
			case 3:
				playerChoiceName = "Scissors";
			}

			switch (computerChoice)
			{
			case 1:
				if (playerChoice == 1)
				{
					matchResult = 0;
				}
				else
				{
					matchResult = (playerChoice == 2) ? 1 : 2;
				}
				computerChoiceName = "Rock";
				break;
			case 2:
				if (playerChoice == 2)
				{
					matchResult = 0;
				}
				else
				{
					matchResult = (playerChoice == 3) ? 1 : 2;
				}
				computerChoiceName = "Paper";
				break;
			case 3:
				if (playerChoice == 3)
				{
					matchResult = 0;
				}
				else
				{
					matchResult = (playerChoice == 1) ? 1 : 2;
				}
				computerChoiceName = "Scissors";
			}
			System.out.print("Computer chose ");
			System.out.println(computerChoiceName);
			if (matchResult == 0)
			{
				System.out.println("Draw");
			}
			else if (matchResult == 1)
			{
				System.out.println(playerChoiceName + " beats " + computerChoiceName + ", Player Wins!");
			}
			else
			{
				System.out.println(computerChoiceName + " beats " + playerChoiceName + ", Computer Wins!");
			}
		}
		else
		{
			System.out.println("Invalid choice.");
		}
	}
}
