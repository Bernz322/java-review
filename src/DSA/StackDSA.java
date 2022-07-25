package DSA;

import java.util.Stack;

public class StackDSA {
    // A LIFO Data Structure - Last-In-First-Out
    /**
     * Basically a stack of something like books
     * Put one first, then add another one and so on.
     * In order to get the first added, the others that
     * was later on added has to be removed first
     * Stores OBJECTS in "vertical tower"
     * push() - add to the top
     * pop() - remove to the top
     * It starts with 1 from the top, not 0
     */
    /**
     * Uses:
     * Undo/ Redo features in text editors
     * Move back/forward in browser (history)
     * Backtracking algo (maze, file directories)
     */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Array List");
        stack.push("Linked List");
        stack.push("Stack");
        stack.push("Queues");
        stack.push("Hash Map");

        System.out.println(stack); // [Array List, Linked List, Stack, Queues, Hash Map]

        System.out.println("================");
        // Pop last one and assign it
        String theOnlyAnswer = stack.pop();

        // Prints new array without popped elem
        System.out.println(stack); // [Array List, Linked List, Stack, Queues]

        System.out.println("================");
        // Print popped elem
        System.out.println(theOnlyAnswer); // Hash Map

        System.out.println("================");
        // Print elem that is on top of the stack
        System.out.println(stack.peek()); // Queues

        System.out.println("================");
        // Search and return index from the top/ tower (starts with 1)
        // If search doesn't find the item, it will return -1
        System.out.println(stack.search("Stack")); // 2
        System.out.println(stack.search("Trees")); // -1
    }
}
