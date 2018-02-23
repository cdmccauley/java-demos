/*
 * VehicleCarTruckMinivan.java
 * inspect some vehicles
 * by christopher mccauley
 */

package vehiclecartruckminivan;

public class VehicleCarTruckMinivan {
    
        public static void main(String[] args) {
        //Vehicle: color, doors, fuelSource, cylinders, transmission, driveType
        //Car: roofOption
        //Truck: bedType, cabOption, rearAxle
        //Minivan: sideDoor, roofOption, mediaOption
        Car volvo = new Car("Black", 4, "Diesel", 6, "Manual", "Front-Wheel", "Moonroof");
        Car brz = new Car("Blue", 2, "Gasoline", 8, "Manual", "AWD", "Sunroof");
        Car prius = new Car("White", 4, "Electric", 4, "Automatic", "Front-Wheel");
        Truck f150 = new Truck("White", 2, "Gasoline", 8, "Manual", "Four-Wheel", "Pickup");
        Truck f350 = new Truck("Black", 4, "Diesel", 8, "Automatic", "Four-Wheel", "Flatbed", "Crew", "Dual Wheel");
        Minivan odyssey = new Minivan("Maroon", 2, "Gasoline", 4, "Automatic", "Front-Wheel", "Dual", "Roof Rack", "Entertainment");
        Minivan pacifica = new Minivan("Black", 2, "Hybrid", 4, "Automatic", "Front-Wheel", "Single", "Entertaiment");
        
        System.out.println(volvo.inspectVehicle() + "\n" + volvo.startVehicle() + "\n");
        System.out.println(brz.inspectVehicle() + "\n" + brz.startVehicle() + "\n");
        System.out.println(prius.inspectVehicle() + "\n" + prius.startVehicle() + "\n");
        
        System.out.println(f150.inspectVehicle() + "\n" + f150.startVehicle() + "\n");
        System.out.println(f350.inspectVehicle() + "\n" + f350.startVehicle() + "\n");
        
        System.out.println(odyssey.inspectVehicle() + "\n" + odyssey.startVehicle() + "\n");
        System.out.println(pacifica.inspectVehicle() + "\n" + pacifica.startVehicle() + "\n");
    }
}