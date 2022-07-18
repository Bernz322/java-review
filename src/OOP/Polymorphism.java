package OOP;

public class Polymorphism {
    /*
     * Polymorphism means "many forms" and occurs when we have many classes that are
     * related with each other through inheritance
     */

    /*
     * Similar to Inheritance, all attrib and methods can be used by subclasses
     * It saves space and make codes consistent
     * ----------------------------------------
     * Imagine the example below; we have animalSound method and each animal classes
     * can use this method.
     * Instead of creating methods for each animal (pigSound & dogSound), we can
     * just use the animalSound from the superclass.
     * ----------------------------------------
     * Perform 1 action in multiple ways
     */

    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    public static void main(String[] args) {
        // Make the classes static if you want to use the below code
        // Animal myAnimal = new Animal(); // Create a Animal object
        // Animal myPig = new Pig(); // Create a Pig object
        // Animal myDog = new Dog(); // Create a Dog object
        // myAnimal.animalSound();
        // myPig.animalSound();
        // myDog.animalSound();

    }
}
