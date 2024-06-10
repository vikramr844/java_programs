package oopsinheritance;


public abstract class Inheritance  implements InhritanceVehicle, InheritanceOverriding {
    public static void main(String[] args) {

        System.out.println("\n");
       Dog d1 = new Dog();
       d1.makeSound();
        System.out.println("\n  ");
        InhritanceVehicle.Vehicle MyCar = new InhritanceVehicle.Car("Maruthi", "Swift", 2003);
        MyCar.displayInfo();
    }

}
