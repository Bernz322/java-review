package Swing;

public class ProductList {
    // Encapsulation
    private int id;
    private String name;
    private int price;
    private int quantity;

    public ProductList(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductID() {
        return id;
    }

    public void setProductID(int id) {
        this.id = id;
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public int getProductPrice() {
        return price;
    }

    public void setProductPrice(int price) {
        this.price = price;
    }

    public int getProductQuantity() {
        return quantity;
    }

    public void setProductQuantity(int quantity) {
        this.quantity = quantity;
    }
}
