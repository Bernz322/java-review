package Basics;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("Return Bigger number: " + Math.max(3, 1));
        System.out.println("Return Smaller number: " + Math.min(3, 1));
        System.out.println("Return Absolute number: " + Math.abs(-11));
        System.out.println("Round up number (based on the next given n): " + Math.ceil(1.5));
        System.out.println("Round down number (less than to given n): " + Math.floor(1.5));
        System.out.println("Return random number between 5 & 30: " + (int) (5 + (Math.random() * 30)));
        System.out.println("Return Power: " + Math.pow(2, 2));
    }
}
