package aims.src.cart;

import aims.src.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

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

    public void printCart(Cart cart) {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        int i = 1;
        for (Media item : itemsOrdered) {
            System.out.println(i + ". DVD - " + item.getTitle() + " - " + item.getCategory() + ": " + item.getCost() + "$");
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

    public ObservableList<Media> getItemsOrdered() {
        ObservableList<Media> items = FXCollections.observableArrayList();
        items.addAll(itemsOrdered);
        return items;
    }


    public void sortByTitleCost() {
		this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
	}
	public void sortByCostTitle() {
		this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
	}

}
