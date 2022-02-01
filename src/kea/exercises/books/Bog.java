package kea.exercises.books;

public class Bog {

    private String ISBN_nummer;
    private String title;
    private int udgivelsesår;

    public Bog(String isbn, String titel, int år) {
        this.ISBN_nummer = isbn;
        this.title = titel;
        this.udgivelsesår = år;
    }

    public String getISBN_nummer() {
        return ISBN_nummer;
    }

    public void setISBN_nummer(String ISBN_nummer) {
        this.ISBN_nummer = ISBN_nummer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "ISBNnummer: " + ISBN_nummer +
                ", Title: " + title +
                ", Udgivelsesår: " + udgivelsesår;
    }
}
