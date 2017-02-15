package edu.ucsd.cs110.temperature;

/**
 * Created by E6420 on 2/15/2017.
 */
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float v = this.getValue();
        v = (v*9)/5 + 32;
        Temperature temp = new Fahrenheit(v);
        return temp;
    }

    public String toString()
    {
        float v = this.getValue();
        return "" + v + " C";
    }
}
