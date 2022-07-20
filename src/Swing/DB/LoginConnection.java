package Swing.DB;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

import Swing.LoginForm;
import Swing.Table;

public class LoginConnection {

    public void SignIn(String username, String password) {
        if (verify_field(username, password)) {
            try {
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud?",
                        "root", "");

                PreparedStatement ps = conn
                        .prepareStatement("SELECT * FROM `user` WHERE `username` = ? AND `password` = ?");

                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Admin Access Granted");
                    LoginForm.frame.dispose();
                    new Table();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong credentials!");
                }
            } catch (SQLException e) {
                Logger.getLogger(LoginConnection.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public static boolean verify_field(String username, String password) {
        // Check for empty fields
        if (username.trim().equals("") || password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty", "Empty information", 2);
            return false;
        } else {
            return true;
        }
    }
}
