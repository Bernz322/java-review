package OOP;

public class Inheritance {
    // Inherit attributes and methods from one class to another
    // Useful for code reusability

    // Superclass
    static class Vehicle {
        protected String brand = "Ford";

        public void honk() {
            System.out.println("Peepeep!");
        }
    }

    // Subclass
    static class Car extends Vehicle {
        private String modelName = "Mustang";

        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }

}
