package Basics;

import javax.swing.JOptionPane;

public class SimpleGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null, name);
    }
}
