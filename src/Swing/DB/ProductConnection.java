package Swing.DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;

import Swing.ProductList;
import Swing.Table;

public class ProductConnection {

    public static ArrayList<ProductList> getProducts() {
        // ProductList contains: name, price, quantity
        ArrayList<ProductList> list = new ArrayList<>();

        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud?",
                    "root", "");

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM `products`");
            ResultSet rs = ps.executeQuery();
            ProductList pl;

            while (rs.next()) {
                // Run to the constructor of ProductList for typing, similar to Typescript
                pl = new ProductList(rs.getInt("id"), rs.getString("name"), rs.getInt("price"), rs.getInt("quantity"));
                list.add(pl);
            }

        } catch (Exception e) {
            Logger.getLogger(LoginConnection.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }

        return list;
    }

    public static ArrayList<ProductList> SearchProductByID(int id) {
        ArrayList<ProductList> list = new ArrayList<>();

        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud?",
                    "root", "");

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM `products` WHERE (`id`) LIKE ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            ProductList pl;

            while (rs.next()) {
                // Run to the constructor of ProductList for typing, similar to Typescript
                pl = new ProductList(rs.getInt("id"), rs.getString("name"), rs.getInt("price"), rs.getInt("quantity"));
                list.add(pl);
            }

        } catch (Exception e) {
            Logger.getLogger(LoginConnection.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }

        return list;
    }

    public void AddProduct(String name, int price, int quantity) {
        if (verify_field()) {
            try {
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud?",
                        "root", "");

                PreparedStatement ps = conn.prepareStatement(
                        "INSERT INTO `products` (`name`, `price`, `quantity`) VALUES (?,?,?)");

                ps.setString(1, name);
                ps.setInt(2, price);
                ps.setInt(3, quantity);

                if (ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(null, "Product added successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
                Table.product_name_field.setText("");
                Table.product_price_field.setText("");
                Table.product_quantity_field.setText("");

            } catch (Exception e) {
                Logger.getLogger(LoginConnection.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void UpdateProduct(int id, String name, int price, int quantity) {
        if (verify_field()) {
            try {
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud?",
                        "root", "");

                PreparedStatement ps = conn.prepareStatement(
                        "UPDATE `products` SET `name` = ?, `price` = ?, `quantity` = ? WHERE `id`=?");

                ps.setString(1, name);
                ps.setInt(2, price);
                ps.setInt(3, quantity);
                ps.setInt(4, id);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Product updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
                Table.product_name_field.setText("");
                Table.product_price_field.setText("");
                Table.product_quantity_field.setText("");
                Table.search_product_id_field.setText("");

            } catch (Exception e) {
                Logger.getLogger(LoginConnection.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void DeleteProduct(int id) {
        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud?",
                    "root", "");

            PreparedStatement ps = conn.prepareStatement("DELETE FROM `products` WHERE `id`=?");
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Product deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
            }
            Table.product_name_field.setText("");
            Table.product_price_field.setText("");
            Table.product_quantity_field.setText("");
            Table.search_product_id_field.setText("");

        } catch (Exception e) {
            Logger.getLogger(LoginConnection.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static boolean verify_field() {
        // Check for empty fields
        String name = Table.product_name_field.getText();
        String price = Table.product_price_field.getText();
        String quantity = Table.product_quantity_field.getText();

        if (name.trim().equals("") || price.trim().equals("") || quantity.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty.",
                    "Empty fields", 2);
            return false;
        } else {
            return true;
        }
    }
}
