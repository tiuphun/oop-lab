package aims.src.store;

import java.util.ArrayList;

import aims.src.media.Media;

public class Store {
    private static ArrayList<Media> itemsInStore = new ArrayList<Media> ();

    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media already exists!");
        } else {
            itemsInStore.add(media);
            System.out.println("Media added!");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed!");
        } else {
            System.out.println("Media does not exist!");
        }
    }

    public void displayStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        int i = 1;
        for (Media item : itemsInStore) {
            System.out.println(i + ". DVD - " + item.getTitle() + " - " + item.getCategory() + " - " + ": " + item.getCost() + "$");
            i++;
        }
        System.out.println("***************************************************");
    }

    public ArrayList<Media> getItemsInStore() {
        ArrayList<Media> itemsList = new ArrayList<>();
        for (Media media : itemsInStore) {
            itemsList.add(media);
        }
        return itemsList;
    }
}
