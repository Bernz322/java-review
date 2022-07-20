package Swing;

import javax.swing.*;
import javax.swing.table.*;

import Swing.DB.ProductConnection;

import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Table {

    JFrame frame = new JFrame("Table CRUD");
    static JTable table = new JTable();
    JScrollPane scrollpane = new JScrollPane();
    JButton add_btn = new JButton("Add");
    JButton update_btn = new JButton("Update");
    JButton delete_btn = new JButton("Delete");
    JButton reset_btn = new JButton("Reset");
    JButton search_btn = new JButton("Search");
    public static JTextField product_name_field = new JTextField();
    public static JTextField product_price_field = new JTextField();
    public static JTextField product_quantity_field = new JTextField();
    public static JTextField search_product_id_field = new JTextField();
    JLabel product_name_label = new JLabel("Product Name:");
    JLabel product_price_label = new JLabel("Price (₱):");
    JLabel product_quantity_label = new JLabel("Quantity:");
    JLabel search_product_id_label = new JLabel("Product ID");
    JLabel title = new JLabel("Java Swing | CRUD", SwingConstants.CENTER);
    JLabel sub_title = new JLabel("----Operations----", SwingConstants.CENTER);

    ProductConnection pc = new ProductConnection();
    public static DefaultTableModel model = (DefaultTableModel) table.getModel();

    public Table() {
        Dimension min = new Dimension(500, 600);
        Dimension max = new Dimension(500, 600);

        frame.setMinimumSize(min);
        frame.setMaximumSize(max);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);

        title.setBounds(10, 10, 460, 25);
        title.setFont(new Font("Arial", 0, 25));
        sub_title.setBounds(10, 170, 460, 25);
        sub_title.setFont(new Font("Arial", 0, 25));
        product_name_label.setBounds(10, 65, 90, 25);
        product_price_label.setBounds(10, 100, 90, 25);
        product_quantity_label.setBounds(10, 135, 90, 25);
        product_name_field.setBounds(110, 65, 240, 25);
        product_price_field.setBounds(110, 100, 240, 25);
        product_quantity_field.setBounds(110, 135, 240, 25);

        search_product_id_label.setBounds(370, 65, 100, 25);
        search_product_id_field.setBounds(370, 100, 100, 25);
        search_btn.setBounds(370, 135, 100, 25);

        add_btn.setBounds(10, 215, 100, 25);
        update_btn.setBounds(130, 215, 100, 25);
        delete_btn.setBounds(250, 215, 100, 25);
        reset_btn.setBounds(370, 215, 100, 25);
        scrollpane.setBounds(10, 250, 460, 250);

        // Table
        TableSettings();
        ProductsTableGenerator();
        Actions();

        frame.add(scrollpane);
        frame.add(title);
        frame.add(sub_title);
        frame.add(add_btn);
        frame.add(update_btn);
        frame.add(delete_btn);
        frame.add(reset_btn);
        frame.add(search_btn);
        frame.add(search_product_id_label);
        frame.add(product_name_field);
        frame.add(product_price_field);
        frame.add(product_quantity_field);
        frame.add(search_product_id_field);
        frame.add(product_name_label);
        frame.add(product_price_label);
        frame.add(product_quantity_label);
        frame.setVisible(true);
    }

    public void TableSettings() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        model.addColumn("Product ID");
        model.addColumn("Product Name");
        model.addColumn("Price (₱)");
        model.addColumn("Quantity");
        model.setRowCount(0);
        model.setColumnCount(4);

        scrollpane.setViewportView(table);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setEnabled(false);
        for (int x = 0; x < 4; x++) {
            // Center cells
            table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
    }

    public void ProductsTableGenerator() {
        // Display all products in a table
        ArrayList<ProductList> list = ProductConnection.getProducts();
        model.setRowCount(0);
        Object rowData[] = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getProductID();
            rowData[1] = list.get(i).getProductName();
            rowData[2] = list.get(i).getProductPrice();
            rowData[3] = list.get(i).getProductQuantity();

            model.addRow(rowData);
        }
    }

    public void SearchedProductTableGenerator(ArrayList<ProductList> list) {
        // Display searched product
        model.setRowCount(0);
        Object rowData[] = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getProductID();
            rowData[1] = list.get(i).getProductName();
            rowData[2] = list.get(i).getProductPrice();
            rowData[3] = list.get(i).getProductQuantity();

            model.addRow(rowData);
        }
    }

    public void Actions() {
        add_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = product_name_field.getText();
                    int price = Integer.parseInt(product_price_field.getText());
                    int quantity = Integer.parseInt(product_quantity_field.getText());

                    pc.AddProduct(name, price, quantity);
                    // Fetch Table again to let new data appear
                    ProductsTableGenerator();
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Please recheck Product's Name, Price, and Quantity fields.",
                            "Empty or incorrect inputs", 2);
                }
            }
        });
        update_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = product_name_field.getText();
                    int price = Integer.parseInt(product_price_field.getText());
                    int quantity = Integer.parseInt(product_quantity_field.getText());
                    int id = Integer.parseInt(search_product_id_field.getText());

                    pc.UpdateProduct(id, name, price, quantity);
                    // Fetch Table again to let new data appear
                    ProductsTableGenerator();
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null,
                            "Please recheck Product's Name, Price, Quantity, and ID fields.",
                            "Empty or incorrect inputs", 2);
                }
            }
        });
        delete_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(search_product_id_field.getText());

                    pc.DeleteProduct(id);
                    // Fetch Table again to let new data appear
                    ProductsTableGenerator();
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null,
                            "Please recheck Product's Name, Price, Quantity, and ID fields.",
                            "Empty or incorrect inputs", 2);
                }
            }
        });
        search_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(search_product_id_field.getText());
                    ArrayList<ProductList> list = ProductConnection.SearchProductByID(id);
                    SearchedProductTableGenerator(list);
                    product_name_field.setText(list.get(0).getProductName());
                    product_price_field.setText(Integer.toString(list.get(0).getProductPrice()));
                    product_quantity_field.setText(Integer.toString(list.get(0).getProductQuantity()));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Product does not exist", "404", 2);
                }
            }
        });
        reset_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    product_name_field.setText("");
                    product_price_field.setText("");
                    product_quantity_field.setText("");
                    search_product_id_field.setText("");
                    ProductsTableGenerator();
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "One or more informations are empty", "Empty information", 2);
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                new LoginForm();
            }
        });
    }

    public static void main(String[] args) {
        new Table();
    }
}
