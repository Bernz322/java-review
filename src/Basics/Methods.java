package Basics;

public class Methods {
    public static void printSomething() {
        System.out.println("Something");
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();

        printSomething(); // If static, it can be accessed without creating an object of the class
        System.out.println(methods.sum(10, 10)); // If non-static, it must be accessed with a created object
    }
}
