package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    /*
     * Unlike the built-in array, Arraylist is resizable.
     * Datatypes to be used must be wrapper (Integer, Double) instead of primitive
     * 
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> job = new ArrayList<String>();
        ArrayList<Integer> grade = new ArrayList<Integer>();
        ArrayList<ArrayList<String>> twoD = new ArrayList<>(); // 2D ArrayList
        names.add("Jeff");
        names.add("Maria");
        names.add("Elon");
        names.add("Faith");
        names.add("Marky");

        job.add("Software Engineer");
        job.add("Teacher");
        job.add("CEO");
        job.add("Nun");
        job.add("Pro Gamer");

        grade.add(2);
        grade.add(3);
        grade.add(1);

        twoD.add(names);
        twoD.add(job);

        System.out.println("---2D Array---");
        System.out.println(twoD.get(0).get(0) + " is a " + twoD.get(1).get(0));

        names.remove(2);
        names.set(1, "Clara");
        Collections.sort(names); // Sort first before printing
        // names.clear(); // Clears all elements/ object in the array list
        System.out.println("---Print names here---");
        for (String i : names) {
            System.out.println(i);
        }
        System.out.println("ArrayList size: " + names.size());
        System.out.println("Get First Element " + names.get(0));
        System.out.println("---Print grades here---");
        for (Integer i : grade) {
            System.out.println(i);
        }
    }
}
