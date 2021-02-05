/**
 * ClassName: Programming 1
 *
 * @author Nguyen Anh Thu Mai
 * @version Version_1
 *
 * Assignment: #Coding_Challenge_5
 * Course: ADEV-1003 (173118)
 * Date Created: Oct 03, 2018 10:00 AM
 * Last Updated: Oct 03, 2018 12:00 AM
 */
public class Challenge5
{
    private static RRCDate myRRC;
    public static void main(String[] args)
    {
        //test default constructor
        myRRC = new RRCDate();
        System.out.println(myRRC);

        //test no-arg constructor
        myRRC = new RRCDate(2, 20, 1998);
        System.out.println(myRRC);

        //test getLongMonth
        System.out.println(myRRC.getLongMonth());

        //test getLongFormat
        System.out.println(myRRC.getLongFormat());

        //test isLeapYear
        myRRC.setYear(2104);
        System.out.println(myRRC.isLeapYear()); //should true
        myRRC.setYear(2400);
        System.out.println(myRRC.isLeapYear()); //should true
        myRRC.setYear(1998);
        System.out.println(myRRC.isLeapYear()); //should false
    }
}
