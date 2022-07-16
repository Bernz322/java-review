package Basics;

public class WrapperClasses {
    /**
     * A way to use primitive data types as reference data type (String) and use
     * their available methods such as string.length().
     * They can still be treated as primitive data types thanks to unboxing
     * conversion but they must be used carefully as they take a long time to be
     * accessed, same with String.
     */

    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 5;
        Double d = 1.2;

        /**
         * To make use of these, treat them as String.
         * Find useful methods by adding . to each of them at the end.
         */

        System.out.println(a.hashCode());
        System.out.println(b.charValue());
        System.out.println(c.byteValue());
        System.out.println(d.isNaN());
    }
}
