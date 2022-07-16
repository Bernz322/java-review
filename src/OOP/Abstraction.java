package OOP;

public class Abstraction {
    /*
     * Data abstraction is the process of hiding certain details and showing only
     * essential information to the user
     */
    /*
     * Abstract class: is a restricted class that cannot be used to create objects
     * (to access it, it must be inherited from another class).
     */
    /*
     * Abstract method: can only be used in an abstract class, and it does not have
     * a body. The body is provided by the subclass (inherited from).
     */
    abstract class Animal {
        public abstract void animalSound();

        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    class Pig extends Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

    public static void main(String[] args) {
        /*
         * Uncommenting below will generate an error as we cannot access
         * abstract classes unless we inheret it from another class (Polymorph/
         * Inheritance)
         * Make the above classes static to use them below. Else go to OOP class
         */
        // Animal myObj = new Animal();
        // Pig pig = new Pig();

        // pig.animalSound();
        // pig.sleep();
    }
}
