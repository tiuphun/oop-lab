package aims.src;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public Book(String title, String category, float cost, int id) {
        super(title, category, cost, id);
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists!");
        } else {
            authors.add(authorName);
            System.out.println("Author added!");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed!");
        } else {
            System.out.println("Author does not exist!");
        }
    }
}