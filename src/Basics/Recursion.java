package Basics;

public class Recursion {
    public int sum(int n) {
        if (n < 0)
            return 0;
        return n + sum(n - 1);
    };

    public static void main(String[] args) {
        Recursion recurse = new Recursion();
        System.out.println(recurse.sum(10));
        // 10 + sum(10-1) + sum(9-1) + ....
    }
}
