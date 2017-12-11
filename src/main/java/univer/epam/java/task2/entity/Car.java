package univer.epam.java.task2.entity;

import univer.epam.java.task2.service.Movable;

public class Car extends Vehicle implements Movable {

    public Car(int coorX, int coorY, int price, int speed, int year) {
        super(coorX, coorY, price, speed, year);
    }

    public int move() {
        return getSpeed();
    }

    @Override
    public String toString() {
        return "Car [coorX=" + getCoorX() + ", coorY=" + getCoorY() + ", price=" +
                getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() + "]";
    }
}
