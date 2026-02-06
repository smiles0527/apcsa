package Chapter4Labs.MathdataLab;

public class Converter
{
    private double conversionFactor;

    public Converter(double aConversionFactor)
    {
        conversionFactor = aConversionFactor;
    }

    public double convertTo(double fromMeasurement)
    {
        return fromMeasurement * conversionFactor;
    }

    public double convertFrom(double toMeasurement)
    {
        return toMeasurement / conversionFactor;
    }
}
