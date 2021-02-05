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
public class Declaration
{
	public static void main( String [] args )
	{
		double Pi = 3.14159,  ServicesTaxRate = 13;
		int MonthsInAYear = 12,CurrentGoods = 55165, SIN = 123456789;
		byte AgeOfPerson = 20;
		char Answer = 'A';
		boolean BankOverDraft = true;

		System.out.println ("Pi = " + Pi);
		System.out.println ("The current Goods and Service Tax rate is " + CurrentGoods + " and " + ServicesTaxRate);
		System.out.println ("A social insurance number is " + SIN);
		System.out.println ("Number of months in a year is " + MonthsInAYear);
		System.out.println ("A person's age is " + AgeOfPerson);
		System.out.println ("The answer to multiple choice question 1 is " + Answer);
		System.out.println ("Is the bank account in overdraft? " + BankOverDraft);
	}
}