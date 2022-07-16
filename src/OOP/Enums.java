package OOP;

public class Enums {
    /**
     * Enum is a special "class" that represents a group of constants (unchangeable
     * variables, like final variables).
     */
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level);

        switch (level) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
            default:
                System.out.println("Unknown Level");
        }

        // Loop enum values with values()
        for (Level level2 : Level.values()) {
            System.out.println(level2);
        }
    }
}