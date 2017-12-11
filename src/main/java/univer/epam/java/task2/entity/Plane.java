package univer.epam.java.task2.entity;

import univer.epam.java.task2.service.Flyable;

public class Plane extends Vehicle implements Flyable {
    private double height;
    private int passengers;

    public Plane(int coorX, int coorY, int price, int speed, int year, double height, int passengers) {
        super(coorX, coorY, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public int fly() {
        return getSpeed();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane [coorX=" + getCoorX() + ", coorY=" + getCoorY() + ", price=" +
                getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() +
                ", height=" + getHeight() + ", passengers=" + getPassengers() + "]";
    }
}
