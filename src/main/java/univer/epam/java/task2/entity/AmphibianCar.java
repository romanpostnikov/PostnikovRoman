package univer.epam.java.task2.entity;

import univer.epam.java.task2.service.Movable;
import univer.epam.java.task2.service.Swimmable;

public class AmphibianCar extends Vehicle implements Movable, Swimmable {

    public AmphibianCar(int coorX, int coorY, int price, int speed, int year) {
        super(coorX, coorY, price, speed, year);
    }

    public int swim() {
        return getSpeed();
    }

    public int move() {
        return getSpeed();
    }

    public String toString() {
        return "Amphibian Car [coorX=" + getCoorX() + ", coorY=" + getCoorY() + ", price=" +
                getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() + "]";
    }
}
