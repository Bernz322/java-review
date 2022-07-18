package OOP;

public class OOP extends Polymorphism {
    // Extend the class from external file we want to use

    public static void main(String[] args) {
        // Encapsulation
        Encapsulation encapsulate = new Encapsulation();
        System.out.println("Name: " + encapsulate.getName());
        encapsulate.setAge(23);
        System.out.println("Age: " + encapsulate.getAge());

        // Abstraction from other file
        // Abstraction abs = new Abstraction();
        // Pig pig = abs.new Pig();

        // pig.animalSound();
        // pig.sleep();

        // Polymorphism from other file
        Polymorphism polymorph = new Polymorphism();
        Dog dog = polymorph.new Dog();
        dog.animalSound();
    }

}
