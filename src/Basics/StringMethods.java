package Basics;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Jeff";

        // Compare strings and ignore lower/ upper cases
        // boolean modified = name.equalsIgnoreCase("jeff");

        // int modified = name.length(); // String length

        // int modified = name.indexOf("f"); // Return index of the specified char

        // char modified = name.charAt(0); // Return the char at the specified index

        // boolean modified = name.isEmpty(); // Check if string is empty

        // String modified = name.toUpperCase(); // Return string in uppercase

        // String modified = name.toLowerCase(); // Return string in lowercase

        // Return string without spaces from left and right
        // String modified = name.trim();

        // Replace specified char (first param) with the second param
        String modified = name.replace("f", "l");
        System.out.println(modified);

        // Read more at: https://www.w3schools.com/java/java_ref_string.asp
    }
}
