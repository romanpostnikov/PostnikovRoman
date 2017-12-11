package univer.epam.java.task2.controller;

import univer.epam.java.task2.entity.*;

import java.util.Random;

public class VehicleGenerator {
    public static Vehicle[] vehicleGenerator(int n) {
        Vehicle[] masVehicle = new Vehicle[n];
        Random r = new Random();
        for (int i = 0; i < masVehicle.length; i++) {
            masVehicle[i] = nextVehicle(r.nextInt(5));
        }
        return masVehicle;
    }

    private static Vehicle nextVehicle(int key) {
        switch (key) {
            case 0:
                return new AmphibianCar(rand(0,100), rand(0,100), rand(10000, 50000), rand(30, 100), rand(1960, 2017));
            case 1:
                return new Batmobile(rand(0,100), rand(0,100), rand(1000000, 6000000), rand(300, 600), rand(1975, 2017));
            case 2:
                return new Car(rand(0,100), rand(0,100), rand(2000, 150000), rand(160, 350), rand(1985, 2017));
            case 3:
                return new Plane(rand(0,100), rand(0,100), rand(1000000, 10000000), rand(800, 1300), rand(1970, 2017), rand(4000, 10000), rand(2, 520));
            case 4:
                return new Ship(rand(0,100), rand(0,100), rand(15000, 4000000), rand(30, 70), rand(1980, 2017), rand(5, 600), "Odessa");
            default:
                return null;
        }
    }

    private static int rand(int min, int max){
        return (int)(min + Math.random()*(max-min));
    }


}
