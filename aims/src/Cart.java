package aims.src;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media> ();

    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Media already exists!");
        } else {
            itemsOrdered.add(media);
            System.out.println("Media added!");
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Media removed!");
        } else {
            System.out.println("Media does not exist!");
        }
    }


    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        int i = 1;
        for (Media item : itemsOrdered) {
            System.out.println(i + ". DVD - " + item.getTitle() + " - " + item.getCategory() + " - " + item.getDirector() + " - " + itemsOrdered[i].getLength() + ": " + item.getCost() + "$");
            i++;
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }


    public void searchByID(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {
                System.out.println(item.getTitle());
                return;
            }
        }
        System.out.println("Media not found!");
    }

    public void searchByTitle(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                System.out.println("Found the disc:");
                System.out.println(item.getTitle());
                return;
            }
        }
        System.out.println("Media not found!");
    }

    public float totalCost() {
        float total = 0.0f;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }
}
