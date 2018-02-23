/*
 * minivan class
 */
package vehiclecartruckminivan;

public class Minivan extends Vehicle {
    String doorType;  
    String firstOption;
    String secondOption;
    
    /**
     * constructor
     * pre: none
     * post: truck object created
     */
    public Minivan(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String doorType) {
                super(color, doors, fuelSource, cylinders, transmission, driveType);
                this.doorType = doorType;
    }
    
    /**
     * options constructor
     * pre: none
     * post: truck object created
     */
    public Minivan(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String doorType, String firstOption) {
                this(color, doors, fuelSource, cylinders, transmission, driveType, doorType);
                this.firstOption = firstOption;
    }
    
    /**
     * options constructor
     * pre: none
     * post: truck object created
     */
    public Minivan(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String doorType, String firstOption, String secondOption) {
                this(color, doors, fuelSource, cylinders, transmission, driveType, doorType, firstOption);
                this.secondOption = secondOption;
    }
    
    /**
     * inspects the minivan
     * pre: none
     * post: string returned
     */
    public String inspectVehicle() {
        String inspectString;
        
        inspectString = "You notice a flyer with details about the minivan in the window." 
                + "\nColor: " + color + "\nDoors: " + doors + "\nTransmission: " 
                + transmission + "\nCylinders: " + cylinders + "\nFuel: " 
                + fuelSource + "\nDrive Type: " + driveType + "\nSide Door: " + doorType;
        if (firstOption == "Roof Rack" || firstOption == "Entertainment") {
            inspectString += "\nOption: " + firstOption;
        }
        if (secondOption == "Roof Rack" || secondOption == "Entertainment") {
            inspectString += "\nOption: " + secondOption;
        }
        return(inspectString);
    }
    
    /**
     * starts the minivan
     * pre: none
     * post: string returned
     */
    public String startVehicle() {
        String startString;
        
        startString = "You start the minivan.";
        if (super.fuelSource.toLowerCase().compareTo("hybrid") == 0) {
            startString += " It is very quiet...";
        } else {
            startString += " It sounds good.";
        }
        return(startString);
    }
}