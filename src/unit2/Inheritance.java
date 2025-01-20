package unit2;

public class Inheritance {

    public static void main(String[] args) {
        //Multilevel
        Vehicle vehicleCar = new Car("BMW", "GJ05MK4626", "JK89HH89", "KLJ09DJ4434", "white", 7500000d);
        vehicleCar.startVehicle();
        System.out.println(vehicleCar);

        Vehicle vehicleBike = new Bike("Yamaha", "GJ03MK0789", "GH89HH89", "JU84LDS0", "black", 1800000d);
        vehicleBike.startVehicle();
        System.out.println(vehicleBike);

        //Hierarchical
        HeavyVehicle heavyVehicle = new HeavyVehicle("Tata", "GJ05MM2006", "GH89LH89", "JU84LDS0", "black", 21800000d);
        heavyVehicle.startVehicle();
        LightVehicle lightVehicle = new LightVehicle("Volvo", "GJ05MM2006", "UH89HH89", "JU84LLS0", "black", 80000d);
        lightVehicle.startVehicle();
    }
}

class Vehicle {
    String brandName;

    String vehicleNumber;
    String enginNumber;
    String rcNumber;
    String color;
    Double onRoadPrice;

    public Vehicle(String brandName, String vehicleNumber, String enginNumber, String rcNumber, String color, Double onRoadPrice) {
        this.brandName = brandName;
        this.vehicleNumber = vehicleNumber;
        this.enginNumber = enginNumber;
        this.rcNumber = rcNumber;
        this.color = color;
        this.onRoadPrice = onRoadPrice;
    }

    public void startVehicle() {
        System.out.println("Starting Vehicle");
    }
}

class Car extends Vehicle {

    int doorCount, personCapacity, tyreSize;
    String musicSystem;
    boolean ac;

    public Car(String brandName, String vehicleNumber, String enginNumber, String rcNumber, String color, Double onRoadPrice) {
        super(brandName, vehicleNumber, enginNumber, rcNumber, color, onRoadPrice);
        doorCount = 4;
        personCapacity = 5;
        tyreSize = 8;
        musicSystem = "boss";
        ac = true;
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting Car");
    }

    @Override
    public String toString() {
        return "doorCount = " + doorCount + "\n" + "personCapacity = " + personCapacity + "\n" + "tyreSize = " + tyreSize + "\n" + "musicSystem = " + musicSystem + "\n" + "ac = " + ac;
    }
}

class Bike extends Car {

    public Bike(String brandName, String vehicleNumber, String enginNumber, String rcNumber, String color, Double onRoadPrice) {
        super(brandName, vehicleNumber, enginNumber, rcNumber, color, onRoadPrice);
        doorCount = 0;
        personCapacity = 2;
        tyreSize = 10;
        musicSystem = "";
        ac = false;
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting Bike");
    }
}

//For
class HeavyVehicle extends Vehicle {
    String maxWeight;
    int tyreCount;

    public HeavyVehicle(String brandName, String vehicleNumber, String enginNumber, String rcNumber, String color, Double onRoadPrice) {
        super(brandName, vehicleNumber, enginNumber, rcNumber, color, onRoadPrice);
        maxWeight = "3000 Kg";
        tyreCount = 16;
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting Heavy Vehicle");
    }
}

class LightVehicle extends Vehicle {
    String maxWeight;
    String minWeight;
    int personCapacity;

    public LightVehicle(String brandName, String vehicleNumber, String enginNumber, String rcNumber, String color, Double onRoadPrice) {
        super(brandName, vehicleNumber, enginNumber, rcNumber, color, onRoadPrice);
        minWeight = "100kg";
        maxWeight = "1000kg";
        personCapacity = 2;
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting Light Vehicle");
    }
}