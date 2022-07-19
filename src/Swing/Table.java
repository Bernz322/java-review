package Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;

public class Table {

    JFrame frame = new JFrame("Table CRUD");
    JTable table = new JTable();
    JScrollPane scrollpane = new JScrollPane();

    public Table() {
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

        // Table
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
