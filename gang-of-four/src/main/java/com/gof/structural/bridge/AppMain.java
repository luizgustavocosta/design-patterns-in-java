package com.gof.structural.bridge;

import com.gof.structural.bridge.abstraction.*;
import com.gof.structural.bridge.implementor.DryBulk;
import com.gof.structural.bridge.implementor.HighCube;
import com.gof.structural.bridge.implementor.Refrigerated;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppMain {

    private static final Logger log = Logger.getLogger(AppMain.class.getName());

    public static void main(String[] args) {
        Arrays.asList(
                new Truck(new HighCube()),
                new WaterCraft(new HighCube()),
                new AirCraft(new DryBulk()),
                new Train(new Refrigerated()))
                .forEach(AppMain::print);

    }

    private static void print(Vehicle vehicle) {
        log.log(Level.INFO, () -> "Vehicle{" +
                "Type = " + vehicle.getClass().getSimpleName() +
                ", Space for = " + vehicle.getCapacity() + " m3" +
                ", [Container {Max load = " + String.format(Locale.US, "%,.3f", vehicle.getContainerMaxLoad()) + " kg" +
                ", Capacity = " + vehicle.getContainerCapacity() + " m3" +
                ", Cost = " + NumberFormat.getCurrencyInstance().format(vehicle.cost()) +
                "']}'");

    }
}
