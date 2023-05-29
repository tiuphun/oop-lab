package aims.src;

public class Store {
    private static DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[10];

    public void addDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc newDisc = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
        int nextIndex = 0;
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                nextIndex = i;
                break;
            }
        }
        itemsInStore[nextIndex] = newDisc;
        System.out.println("Added '" + disc.getTitle() + "' to the store.");
    }


    public void removeDVD(int discID) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getId() == discID) {
                for (int j = i; j < itemsInStore.length - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                System.out.println("Removed " + itemsInStore[i].getTitle() + " from the store.");
                itemsInStore[itemsInStore.length - 1] = null;
                break;
            }
        }
}

    public void displayStore() {
        System.out.println("\n***************STORE:***************");
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null) {
                System.out.println(i + ". " + itemsInStore[i].getTitle());
            }
        }
    }
}
