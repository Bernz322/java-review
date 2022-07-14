package OOP;

public class Encapsulation {
    // Encapsulation - hide variables/ attibutes by making them private.
    // These attrib can only be accessed using getters and setters.
    // They can be read-only or write-only attrib.
    // Increases security data as they are hidden.

    private String name = "Jeffrey Bernadas";
    private int age = 22;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
