package oopsinheritance;

interface InheritanceOverriding {
     void makeSound(); // Method signature only, no method body
}

class Animal implements InheritanceOverriding {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }
}