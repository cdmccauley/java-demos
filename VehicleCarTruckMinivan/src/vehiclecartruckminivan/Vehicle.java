/*
 * vehicle class
 */
package vehiclecartruckminivan;

abstract class Vehicle {
    String type, transmission, driveType, color, fuelSource;
    int cylinders, doors;
    
    /**
     * constructor
     * pre: none
     * post: initializes variables
     */
    public Vehicle(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType) {
                this.color = color;
                this.doors = doors;
                this.fuelSource = fuelSource;
                this.cylinders = cylinders;
                this.transmission = transmission;
                this.driveType = driveType;
    }
    
    /**
     * will inspect the vehicle and it's features
     * pre: none
     * post: returns string describing the features of the vehicle
     */
    abstract String inspectVehicle();
    
    /**
     * will start the vehicle
     * pre: none
     * post: returns string describing the vehicle being started
     */
    abstract String startVehicle();
}