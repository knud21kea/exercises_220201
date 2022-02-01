package kea.exercises.books;

import java.util.ArrayList;
import java.util.Objects;

public class Bibliotek {

    private ArrayList<Bog> library = new ArrayList<>();

    public Bibliotek() {
    }

    public void addBookToLibrary(Bog book) {
        library.add(book);
    }

    public boolean isBookInLibrary(Bog book) {
        return library.contains(book);
    }

    public boolean isThereABookWithThisBooksIsbn(Bog book) {
        String isbn = book.getISBN_nummer();
        boolean foundIsbn = false;
        for (Bog b : library) {
            if (Objects.equals(b.getISBN_nummer(), isbn)) {
                foundIsbn = true;
            }
        }
        return foundIsbn;
    }
}
