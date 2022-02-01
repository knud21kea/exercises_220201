package kea.exercises.books;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        // initialise list
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        boolean contains;
        String result;
        contains = doesArraylistContainString(list, "aaa");
        if (contains) {
            result = "The String has been found.";
        } else {
            result = "The String has not been found.";
        }
        System.out.println(result);


        Bibliotek library = new Bibliotek();
        Bog bog1 = new Bog("111111111-1", "Book one", 2020);
        library.addBookToLibrary(bog1);
        Bog bog2 = new Bog("222222222-2", "Book two", 2021);
        library.addBookToLibrary(bog2);
        Bog bog3 = new Bog("333333333-3", "Book three", 2022);
        library.addBookToLibrary(bog3);

        // A new book with almost the same data
        Bog bog4 = new Bog("333333333-3", "Book three and a bit", 2022);
        boolean exists = library.isBookInLibrary(bog4);
        System.out.println(exists); // Book is not in library.
        exists = library.isThereABookWithThisBooksIsbn(bog4);
        System.out.println(exists); // but the ISBN exists.
    }

    public static boolean doesArraylistContainString(ArrayList<String> lst, String str) {
        return lst.contains(str);
    }
}
