package Testing;

public class Minion {
    private String name;
    private int eyes;
    private String color;
    private String master;

    public Minion(String name, int eyes, String color, String master) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.master = master;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEyes(int eyes) {
        this.eyes = eyes;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setMaster(String master) {
        this.master = master;
    }

    String getName() {
        return this.name;
    }

    int getEyes() {
        return this.eyes;
    }

    String getColor() {
        return this.color;
    }

    String getMaster() {
        return this.master;
    }
}
