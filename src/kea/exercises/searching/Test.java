package kea.exercises.searching;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        // initialise list
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(searchArrayForString(list, "ccc")); // found
        System.out.println(searchArrayForString(list, "eee")); // not found

        // throws exception, handled here.
        try {
            System.out.println(searchArrayForStringWithException(list, "eee"));
        } catch (IllegalArgumentException e) {
            System.out.println("Search string not found in list.");
        }
    }

    private static int searchArrayForString(ArrayList<String> list, String search) {
        return list.indexOf(search); // returns index or -1 as required
    }

    // Throws exception but handled after return
    private static int searchArrayForStringWithException(ArrayList<String> list, String search) {
        int index = list.indexOf(search);
        if (index != -1) {
            return index;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
