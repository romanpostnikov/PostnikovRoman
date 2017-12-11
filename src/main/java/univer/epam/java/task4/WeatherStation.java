package univer.epam.java.task4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import univer.epam.java.task4.view.CurrentConditionsDisplay;

import java.io.IOException;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        try {
            String addr = "http://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b1b15e88fa797225412429c1c50c122a1";
            Document doc = Jsoup.connect(addr).get();
            //IOException

            //HttpURLConnection connection = (HttpURLConnection) addr.openConnection();
            //connection.connect();
            //IOException
            //InputStream inputStream = connection.getInputStream();
            //IOException
            //Weather weather = weatherParser(inputStream);
            //connection.disconnect();
        } catch (IOException e) {
            System.out.println("Exception" + e.toString());


            weatherData.setMeasurements(80, 35, 123);
        }
    }
}
