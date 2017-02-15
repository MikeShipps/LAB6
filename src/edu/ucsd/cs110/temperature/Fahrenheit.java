package edu.ucsd.cs110.temperature;

/**
 * Created by E6420 on 2/15/2017.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius()
    {
        float v = this.getValue();
        v = v - 32;
        v = (v*5)/9;
        Temperature temp = new Celsius(v);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {

        return "" + this.getValue() + " F";
    }
}

