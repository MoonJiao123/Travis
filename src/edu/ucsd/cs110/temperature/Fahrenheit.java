package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature celsius = new Celsius(((this.getValue() - 32) * 5)/9);
        return celsius;

    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return ""+Float.toString(this.getValue())+" F";
    }
}
