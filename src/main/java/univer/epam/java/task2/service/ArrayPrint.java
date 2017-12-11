package univer.epam.java.task2.service;

import univer.epam.java.task2.entity.Vehicle;

public class ArrayPrint {
    public static void printArray(Vehicle[] masVehicle) {
        for(Vehicle vehicle : masVehicle){
            if(vehicle != null)
                System.out.println(vehicle);
        }

    }
}
