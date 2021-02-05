/**
 * @author Mai Nguyen Anh Thu
 * @version 1
 * Assignment: 5
 * Course: ADEV-1003
 * Section:
 * Date Created: Nov 7th 2018
 * Last Updated: Nov 7th 2018
 *------------------summary---------------------------
 * Sky condition: sunny, snowy, cloudy, or rainy
 * 	(default sunny)
 * 	includes:
 *		a constructor
 *		the accessors and mutators
 *		method toString
 *		method equals
 * The temperature: in Fahrenheit
 *	between -50 and +150 (default 70)
 *	convert Fahrenheit to Celsius
 * 	Celsius = (Fahrenheit - 32)*5/9
 * 		temp > 32 && the weather is snowy
 *		temp < 32 && the weather is rainy
 */
public class Client
{
	public static void main(String[] args)
	{
		Weather weather = new Weather();
		Weather weather1 = new Weather();

		// test no-arg constructor
		System.out.println("Expected: Sky condition:sunny. The temperature is: 70.0");
		System.out.println("	Actual: " + weather);

		// test constructor
		weather = new Weather(40.0,"rainy");
		System.out.println("Expected: Sky condition: rainy. The temperature is: 40.0");
		System.out.println("	Actual: " + weather);

		//test getTemperature()
		System.out.println("Expected: temperature: 40.0. Actual: " + weather.getTemperature());
		//test getSkyCondition()
		System.out.println("Expected: Sky condition: rainy. Actual: " + weather.getSkyCondition());

		//test setTemperature()
		weather.setTemperature(100);
		System.out.println("Expected temperature: 100.0. Actual: " + weather.getTemperature());
		//test setSkyCondition()
		weather.setSkyCondition("cloudy");
		System.out.println("Expected temperature: cloudy. Actual: " + weather.getSkyCondition());

		//test setTemperature out of range between -50 and 150
		weather1.setTemperature(300);
		System.out.println("Expected temperature: 300.0 (out of range). Actual: " + weather1.getTemperature());

		//test conversation
		System.out.println("Expected celsius temperature of 100 Fahrenheit: 18. Actual: " + weather.convert());

		//test toString()
		System.out.println("Test toString: " + weather.toString());

		//test equals()
		//Case 1: not equal
		System.out.println("Weather: " + weather.toString());
		System.out.println("Weather 1: " + weather1);
		System.out.println("Expected: false. Actual: " + weather1.equals(weather));
		//Case 2: equal
		weather.setTemperature(100);
		weather.setSkyCondition("snowy");
		weather1.setTemperature(100);
		weather1.setSkyCondition("snowy");
		System.out.println("Weather: " + weather.toString());
		System.out.println("Weather 1: " + weather1);
		System.out.println("Expected: true. Actual: " + weather1.equals(weather));

		//test consistent()
		//Case 1: temperature > 32 && sky condition is snowy
		weather1.setTemperature(150);
		weather1.setSkyCondition("snowy");
		System.out.println("Expected: false. Actual: " + weather1.consistent());
		//Case 2: temperature < 32 && sky condition is rainy
		weather1.setTemperature(30);
		weather1.setSkyCondition("rainy");
		System.out.println("Expected: false. Actual: " + weather1.consistent());
		//Case 3: result TRUE
		weather1.setTemperature(50);
		weather1.setSkyCondition("rainy");
		System.out.println("Expected: true. Actual: " + weather1.consistent());
	}
}
