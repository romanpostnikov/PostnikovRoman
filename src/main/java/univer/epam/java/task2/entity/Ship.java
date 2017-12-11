package univer.epam.java.task2.entity;

import univer.epam.java.task2.service.Swimmable;

public class Ship extends Vehicle implements Swimmable {
    private int passengers;
    private String port;

    public Ship(int coorX, int coorY, int price, int speed, int year, int passengers, String port) {
        super(coorX, coorY, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    public int swim() {
        return getSpeed();
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship [coorX=" + getCoorX() + ", coorY=" + getCoorY() + ", price=" +
                getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() +
                ", passengers=" + getPassengers() + ", port=" + getPort() + "]";
    }
}
