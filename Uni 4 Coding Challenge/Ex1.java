/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge_4
 * Course: ADEV-1003 (173118)
 * Date Created: Oct 03, 2018 10:00 AM
 * Last Updated: Oct 03, 2018 12:00 AM
 */
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1
{
	public static void main(String[] args)
	{
		int playerChoice, computerChoice;
		int matchResult =0, count = 0;
		double percent; // 0 - draw // 1 - player wins // 2 - computer wins
		Scanner scan = new Scanner(System.in);
		String playerChoiceName = "", computerChoiceName = "";
		DecimalFormat df = new DecimalFormat("#.00%");
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Round "+ i);
			do
			{
				System.out.print("Enter your choice (1 - Rock, 2 - Paper, 3 - Scissors): ");
				playerChoice = scan.nextInt();
				while (playerChoice < 1 || playerChoice > 3)
				{
					System.out.print("Invalid choice! (1, 2 or 3): ");
					playerChoice = scan.nextInt();
				}
				computerChoice = new Random().nextInt(3) + 1;
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
				System.out.println ("Computer chose " + computerChoiceName + ".");
				if (matchResult == 0)
				{
					System.out.println("The round is a draw");
				}
				else if (matchResult == 1)
				{
					count++;
					System.out.println(playerChoiceName + " beats " + computerChoiceName + ", Player Wins!" + "\n" + "You have won " + count + " of " + i + " rounds.");
				}
				else
				{
					System.out.println(computerChoiceName + " beats " + playerChoiceName + ", Computer Wins!" + "\n" + "You have won " + count + " of " + i + " rounds.");
				}
			}
			while (matchResult == 0);
		}
		percent=count/5.0;
		System.out.println("Percentage " + df.format(percent));
	}
}
