package OOP;

public class Classes {
    int x;

    // Constructor
    public Classes(int y) {
        this.x = y;
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Classes myObj = new Classes(10); // Create an object of Classes with parameter for the constructor
        myObj.myPublicMethod(); // Call the public method on the object
        System.out.println(myObj.x); // Call the attribute in the class which is now overwritten by the params
                                     // provided in object creation

    }
}
