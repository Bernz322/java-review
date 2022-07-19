package Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginForm {

    JFrame frame = new JFrame("Login");
    JButton login = new JButton("Login");
    JLabel username_label = new JLabel("Username");
    JLabel password_label = new JLabel("Password");
    JTextField username_field = new JTextField();
    JPasswordField password_field = new JPasswordField();

    public LoginForm() {
        String username_admin = "admin";
        String password_admin = "admin";

        Dimension min = new Dimension(250, 250);
        Dimension max = new Dimension(250, 250);

        frame.setMinimumSize(min);
        frame.setMaximumSize(max);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);

        // Fields
        username_label.setBounds(20, 30, 200, 25);
        username_field.setBounds(20, 55, 200, 25);
        password_label.setBounds(20, 80, 200, 25);
        password_field.setBounds(20, 105, 200, 25);
        login.setBounds(20, 140, 100, 25);

        // Focus Listener
        username_field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (username_field.getText().equals("Enter Username")) {
                    username_field.setText("");
                    username_field.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (username_field.getText().isEmpty()) {
                    username_field.setForeground(Color.GRAY);
                    username_field.setText("Enter Username");
                }
            }

        });

        // Action Listener
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = username_field.getText();
                String password = new String(password_field.getPassword());

                if (username.equals(username_admin) && password.equals(password_admin)) {
                    JOptionPane.showMessageDialog(null, "Admin Access Granted");
                    frame.dispose();
                    new Table();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong credentials!");
                }
            }
        });

        frame.add(username_field);
        frame.add(password_field);
        frame.add(username_label);
        frame.add(password_label);
        frame.add(login);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
