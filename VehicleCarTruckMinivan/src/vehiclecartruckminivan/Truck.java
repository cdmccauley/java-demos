/*
 * truck class
 */
package vehiclecartruckminivan;

public class Truck extends Vehicle {
    String bedType;  
    String firstOption;
    String secondOption;
    
    /**
     * constructor
     * pre: none
     * post: truck object created
     */
    public Truck(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String bedType) {
                super(color, doors, fuelSource, cylinders, transmission, driveType);
                this.bedType = bedType;
    }
    
    /**
     * options constructor
     * pre: none
     * post: truck object created
     */
    public Truck(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String bedType, String firstOption) {
                this(color, doors, fuelSource, cylinders, transmission, driveType, bedType);
                this.firstOption = firstOption;
    }
    
    /**
     * options constructor
     * pre: none
     * post: truck object created
     */
    public Truck(String color, int doors, String fuelSource, int cylinders, 
            String transmission, String driveType, String bedType, String firstOption, String secondOption) {
                this(color, doors, fuelSource, cylinders, transmission, driveType, bedType, firstOption);
                this.secondOption = secondOption;
    }
    
    /**
     * inspects the truck
     * pre: none
     * post: string returned
     */
    public String inspectVehicle() {
        String inspectString;
        
        inspectString = "You notice a flyer with details about the truck in the window." 
                + "\nColor: " + color + "\nDoors: " + doors + "\nTransmission: " 
                + transmission + "\nCylinders: " + cylinders + "\nFuel: " 
                + fuelSource + "\nDrive Type: " + driveType + "\nBed: " + bedType;
        if (firstOption == "Crew" || firstOption == "Extended") {
            inspectString += "\nCab: " + firstOption;
        } else if (firstOption == "Dual Wheel") {
            inspectString += "\nRear Axle: " + firstOption;
        }
        if (secondOption == "Crew" || secondOption == "Extended") {
            inspectString += "\nCab: " + secondOption;
        } else if (secondOption == "Dual Wheel") {
            inspectString += "\nRear Axle: " + secondOption;
        }
        return(inspectString);
    }
    
    /**
     * starts the truck
     * pre: none
     * post: string returned
     */
    public String startVehicle() {
        String startString;
        
        startString = "You start the truck.";
        if (super.fuelSource.toLowerCase().compareTo("diesel") == 0) {
            startString += " It is very loud!";
        } else {
            startString += " It sounds good.";
        }
        return(startString);
    }
}