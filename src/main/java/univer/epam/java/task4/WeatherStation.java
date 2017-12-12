package univer.epam.java.task4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        try {
            Document doc = Jsoup.connect("http://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22")
                    .get();
            Element temperatureElement = doc.select("temperature").first();
            Element humidityElement = doc.select("humidity").first();
            Element pressureElement = doc.select("pressure").first();
            Integer temperature = parseInt(temperatureElement.attr("value"));
            Integer humidity = parseInt(humidityElement.attr("value"));
            Float pressure = parseFloat(pressureElement.attr("value"));


            CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
            ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

            weatherData.setMeasurements(temperature, humidity, pressure);
            weatherData.setMeasurements(temperature, humidity, pressure);
            weatherData.setMeasurements(temperature, humidity, pressure);


        } catch (IOException e) {
            System.out.println("IOException " + e.toString());
        }


    }
}
