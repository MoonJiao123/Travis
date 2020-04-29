package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature{

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

        Temperature fahrenheit = new Fahrenheit(((this.getValue()*9)/5) + 32);
        return fahrenheit;
    }

    public String toString()
    {
        return ""+Float.toString(this.getValue())+" C";
    }
}
