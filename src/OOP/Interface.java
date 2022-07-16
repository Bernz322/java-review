package OOP;

public class Interface {
    /**
     * Completely similar to abstraction but methods are empty.
     * I use this mostly as the concept is imilar to interfaces in Typescript
     */

    static interface Animal {
        public void animalSound(); // interface method (does not have a body)

        public void sleep(); // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    static class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }

        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
    }

    public static void main(String[] args) {
        /*
         * Uncommenting below will generate an error as we cannot access
         * abstract classes unless we inheret it from another class (Polymorph/
         * Inheritance)
         */
        // Animal myObj = new Animal();
        Pig pig = new Pig();

        pig.animalSound();
        pig.sleep();
    }
}
