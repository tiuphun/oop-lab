package aims.src;

public class Store {
    private static DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[10];

    public void addDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc newDisc = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
        itemsInStore[itemsInStore.length - 1] = newDisc;
    }

    public void removeDVD(int discID) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getId() == discID) {
                for (int j = i; j < itemsInStore.length - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemsInStore.length - 1] = null;
                break;
            }
        }
}

    public void displayStore() {
        System.out.println("Store:");
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null) {
                System.out.println(itemsInStore[i].getTitle());
            }
        }
    }
}
