package univer.epam.java.task4;

import univer.epam.java.task4.display.CurrentConditionsDisplay;
import univer.epam.java.task4.display.ForecastDisplay;
import univer.epam.java.task4.display.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ParseMeasurements weatherParse = new ParseMeasurements();

        weatherData.setMeasurements(weatherParse.getTemperature(), weatherParse.getHumidity(), weatherParse.getPressure());
        weatherData.setMeasurements(weatherParse.getTemperature(), weatherParse.getHumidity(), weatherParse.getPressure());
        weatherData.setMeasurements(weatherParse.getTemperature(), weatherParse.getHumidity(), weatherParse.getPressure());
    }
}
