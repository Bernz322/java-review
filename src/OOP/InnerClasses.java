package OOP;

public class InnerClasses {
    class OuterClass {
        int x = 10;

        static class InnerClass {
            int y = 5;
        }

        /*
         * class InnerClass {
         * int y = 5;
         * }
         */
    }

    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        /*
         * If nested class is not static (uncomment line 11-15)
         * OuterClass myOuter = new OuterClass();
         * OuterClass.InnerClass myInner = myOuter.new InnerClass();
         * System.out.println(myInner.y + myOuter.x);
         */
        System.out.println(myInner.y);
    }

    // Outputs 5
}
