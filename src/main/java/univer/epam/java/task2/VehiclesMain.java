package univer.epam.java.task2;

import univer.epam.java.task2.controller.ArraySort;
import univer.epam.java.task2.controller.VehicleGenerator;
import univer.epam.java.task2.entity.Vehicle;

public class VehiclesMain {
    public static void main(String[] args) {
        Vehicle[] masVehicle = VehicleGenerator.vehicleGenerator(10);
        ArraySort.sort(masVehicle);
    }
}
