package Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class SimpleCRUD {

    JFrame frame = new JFrame("Simple CRUD");
    JPanel panel = new JPanel();
    JTable table = new JTable();
    JScrollPane scrollpane = new JScrollPane();

    public SimpleCRUD() {
        Dimension min = new Dimension(500, 500);
        Dimension max = new Dimension(520, 520);

        frame.setMinimumSize(min);
        frame.setMaximumSize(max);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);

        scrollpane.setBounds(50, 50, 400, 400);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Sex");
        model.addColumn("Religion");
        model.addRow(new Object[] { "Jeffrey", "18", "Male", "Roman Catholic" });
        table.setModel(model);
        scrollpane.setViewportView(table);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setEnabled(false);

        frame.add(scrollpane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCRUD();
    }
}
