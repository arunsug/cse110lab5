package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue() * 1.8f + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue()+" C";
    }
}
