package univer.epam.java.task2.entity;

import univer.epam.java.task2.service.Flyable;
import univer.epam.java.task2.service.Movable;

public class Batmobile extends Vehicle implements Movable, Flyable {

    public Batmobile(int coorX, int coorY, int price, int speed, int year) {
        super(coorX, coorY, price, speed, year);
    }

    public int fly() {
        return getSpeed();
    }

    public int move() {
        return getSpeed();
    }

    @Override
    public String toString() {
        return "Batmobile [coorX=" + getCoorX() + ", coorY=" + getCoorY() + ", price=" +
                getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() + "]";
    }
}
