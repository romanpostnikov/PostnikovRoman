package univer.epam.java.task2.entity;

public class Vehicle {
    private int coorX;
    private int coorY;
    private int price;
    private int speed;
    private int year;

    public Vehicle(int coorX, int coorY, int price, int speed, int year) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
