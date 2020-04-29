package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature celsius = new Celsius(((this.getValue() - 32) * 5)/9);
        return celsius;
    }

    public String toString()
    {
        return ""+Float.toString(this.getValue())+" F";
    }
}
