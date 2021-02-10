package com.gof.structural.bridge;

import com.gof.structural.bridge.abstraction.Truck;
import com.gof.structural.bridge.abstraction.Vehicle;
import com.gof.structural.bridge.abstraction.WaterCraft;
import com.gof.structural.bridge.implementation.Marine;
import com.gof.structural.bridge.implementation.Road;

public class AppMain {

    public static void main(String[] args) {
        printValues(new Truck(new Road()));
        printValues(new WaterCraft(new Marine()));
    }

    private static void printValues(Vehicle vehicle) {
        System.out.println("vehicle.cost() = " + vehicle.cost());
        System.out.println("vehicle.estimateArrivalTime() = " + vehicle.estimateArrivalTime());
        System.out.println("vehicle.maxLoad() = " + vehicle.maxLoad());
    }
}
