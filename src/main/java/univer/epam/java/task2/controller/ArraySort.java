package univer.epam.java.task2.controller;

import univer.epam.java.task2.entity.Plane;
import univer.epam.java.task2.entity.Vehicle;
import univer.epam.java.task2.service.ArrayPrint;
import univer.epam.java.task2.service.Flyable;
import univer.epam.java.task2.service.Movable;
import univer.epam.java.task2.service.Swimmable;

public class ArraySort {
    public static void sort(Vehicle[] masVehicle) {
        int swimCount, flyCount, moveCount, fasterCount, higherCount, lessCount;
        swimCount = flyCount = moveCount = fasterCount = higherCount = lessCount = 0;

        Vehicle[] masSwimmable = new Vehicle[masVehicle.length];
        Vehicle[] masFlyable = new Vehicle[masVehicle.length];
        Vehicle[] masMovable = new Vehicle[masVehicle.length];
        Vehicle[] masFasterThan = new Vehicle[masVehicle.length];
        Vehicle[] masHigherThan = new Vehicle[masVehicle.length];
        Vehicle[] masLessFive = new Vehicle[masVehicle.length];

        for (Vehicle vehicle : masVehicle) {
            if(vehicle.getYear() > 2012)
                masLessFive[lessCount++] = vehicle;
            if (vehicle instanceof Plane && ((Plane) vehicle).getHeight() > 5000 && vehicle.getYear() > 2000)
                masHigherThan[higherCount++] = vehicle;
            if (! vehicle.getClass().getName().equals("Plane") && vehicle.getSpeed() < 500 && vehicle.getSpeed() > 200)
                masFasterThan[fasterCount++] = vehicle;
            if (vehicle instanceof Swimmable) {
                masSwimmable[swimCount++] = vehicle;
            }
            else if (vehicle instanceof Movable) {
                masMovable[moveCount++] = vehicle;
            }
            else if (vehicle instanceof Flyable) {
                masFlyable[flyCount++] = vehicle;
            }
        }
        System.out.println("\nVehicle array");
        ArrayPrint.printArray(masVehicle);
        System.out.println("\nSwimmable array");
        ArrayPrint.printArray(masSwimmable);
        System.out.println("\nFlyable array");
        ArrayPrint.printArray(masFlyable);
        System.out.println("\nMovable array");
        ArrayPrint.printArray(masMovable);
        System.out.println("\nArray of vehicles, which are faster than 200, but slower than 500 and are not planes");
        ArrayPrint.printArray(masFasterThan);
        System.out.println("\nArray of planes, which flight height is more than 2000 and lower than 5000");
        ArrayPrint.printArray(masHigherThan);
        System.out.println("\nArray of vehicles, which are younger than five years");
        ArrayPrint.printArray(masLessFive);

    }

}
