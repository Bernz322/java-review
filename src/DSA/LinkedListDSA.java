package DSA;

import java.util.LinkedList;

public class LinkedListDSA {
    // Stores Nodes in Data - Address instead of Data - Index in Array
    // Elements are linked using pointers, not indices
    // Nodes are in non-consecutive memory locations
    // Delete and Insert = O(1) while Searching is O(n)

    /**
     * Singly
     * [data | address] -> [data | address] -> [data | address]
     * Doubly
     * [address | data | address] -> [address | data | address] -> [address | data |
     * address]
     */

    /**
     * Singly or Doubly LinkedList where the latter enables traversing back n forth
     * but consumes more memory.
     * 
     * Add and Remove elements in Stacks (push, pop) and Queues (offer, poll)
     * are usable
     * 
     * Advantages:
     * Dynamic DS (allocates needed memory while running)
     * O(1) insert and delete
     * No/ Low memory waste
     * 
     * Disadvantages:
     * Big memory usage (additional pointers)
     * No random access of elements (no index[i])
     * No/ Low memory waste
     * O(n) search
     * 
     * Uses:
     * Implement Stack or Queues
     * Playlists
     */

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offerFirst("First"); // [First]
        linkedList.offer("Second"); // [First, Second]
        linkedList.offerLast("Third"); // [First, Second, Third]
        linkedList.pollFirst(); // [Second, Third]
        linkedList.pollLast(); // [Second]
        linkedList.add(0, "First One"); // [First One, Second]
        System.out.println(linkedList.indexOf("Second")); // 1
        linkedList.peek(); // Returns 1st elem

        System.out.println(linkedList);
    }
}
