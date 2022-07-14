package Basics;

import java.util.*;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        try {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.println("Welcome, " + name + "!");
        } catch (Exception e) {
            // TODO: handle exception
            sc.close();
            System.out.println("Error: " + e);
        }
    }
}
