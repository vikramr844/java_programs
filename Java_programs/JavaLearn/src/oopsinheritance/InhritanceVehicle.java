package oopsinheritance;

public interface InhritanceVehicle {
    class Vehicle {
        // attributes such as brand, model, and year.
        String brand;
        private String model;
        private int year;

        Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("VEHICLE BRAND :" + brand);
            System.out.println("VEHICLE MODEL :" + model);
            System.out.println("VEHICLE YEAR :" + year);
        }
    }

    class Car extends Vehicle {
        int NumDoors = 5;
        String FuelType = "petrol";

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Door in " + brand + " car:" + NumDoors);
            System.out.println("Number of Door in " + brand + " car:" + FuelType);
        }

        Car(String brand, String model, int year) {
            super(brand, model, year);
        }
    }
}
