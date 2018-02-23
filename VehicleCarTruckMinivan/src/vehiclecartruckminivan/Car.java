/*
 * car class
 */
package vehiclecartruckminivan;

public class Car extends Vehicle {
    String roofOption;    
    
    /**
     * constructor
     * pre: none
     * post: car object created
     */
    public Car(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType) {
                super(color, doors, fuelSource, cylinders, transmission, driveType);
                roofOption = "n/a";
    }
    
    /**
     * options constructor
     * pre: none
     * post: car object created
     */
    public Car(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String roofOption) {
                this(color, doors, fuelSource, cylinders, transmission, driveType);
                this.roofOption = roofOption;
    }
    
    /**
     * inspects the car
     * pre: none
     * post: string returned
     */
    public String inspectVehicle() {
        String inspectString;
        
        inspectString = "You notice a flyer with details about the car in the window." 
                + "\nColor: " + color + "\nDoors: " + doors + "\nTransmission: " 
                + transmission + "\nCylinders: " + cylinders + "\nFuel: " 
                + fuelSource + "\nDrive Type: " + driveType;
        if (roofOption.compareTo("Sunroof") == 0 || roofOption.compareTo("Moonroof") == 0) {
            inspectString += "\nOptions: " + roofOption;
        }
        return(inspectString);
    }
    
    /**
     * starts the car
     * pre: none
     * post: string returned
     */
    public String startVehicle() {
        String startString;
        
        startString = "You start the car.";
        if (super.fuelSource.toLowerCase().compareTo("electric") == 0) {
            startString += " It is very quiet...";
        } else if (super.fuelSource.toLowerCase().compareTo("diesel") == 0) {
            startString += " It is very loud!";
        } else {
            startString += " It sounds good.";
        }
        return(startString);
    }
}