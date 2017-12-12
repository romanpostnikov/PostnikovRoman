package univer.epam.java.task4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class ParseMeasurements {

    private Document doc;
    private Element temperatureElement;
    private Element humidityElement;
    private Element pressureElement;
    private Float temperature;
    private Float minTemperature;
    private Float maxTemperature;
    private Integer humidity;
    private Float pressure;

    public ParseMeasurements() {
        try{
            doc = Jsoup.connect("http://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").get();
            temperatureElement = doc.select("temperature").first();
            humidityElement = doc.select("humidity").first();
            pressureElement = doc.select("pressure").first();
            temperature = parseFloat(temperatureElement.attr("value"));
            minTemperature = parseFloat(temperatureElement.attr("min"));
            maxTemperature = parseFloat(temperatureElement.attr("max"));
            humidity = parseInt(humidityElement.attr("value"));
            pressure = parseFloat(pressureElement.attr("value"));
        }catch (IOException e){
            System.out.println("IOException " + e.toString());
        }
    }


    public Document getDoc() {
        return doc;
    }

    public Element getTemperatureElement() {
        return temperatureElement;
    }

    public Element getHumidityElement() {
        return humidityElement;
    }

    public Element getPressureElement() {
        return pressureElement;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getMinTemperature() {
        return minTemperature;
    }

    public Float getMaxTemperature() {
        return maxTemperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Float getPressure() {
        return pressure;
    }
}
