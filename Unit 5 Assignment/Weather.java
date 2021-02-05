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
import java.text.DecimalFormat;
enum skyCondition {sunny, snowy, cloudy, rainy}
public class Weather
{
    private double temperature;
    private String skyCondition;
    /**
     * Initializes temperature class = 70,
     * and sky condition is sunny
     */
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getSkyCondition() {
        return skyCondition;
    }

    public void setSkyCondition(String skyCondition) {
        this.skyCondition = skyCondition;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + this.temperature +
                ", skyCondition='" + this.skyCondition + '\'' +
                '}';
    }
}



