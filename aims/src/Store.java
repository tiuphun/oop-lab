package aims.src;

public class Store {
    private static DigitalVideoDisc itemsInStore[];

    public void addDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc newDisc = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
        itemsInStore[itemsInStore.length] = newDisc;

    }

    public void removeDVD(int discID) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i].getId() == discID) {
                for (int j = i; j < itemsInStore.length - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemsInStore.length - 1] = null;
                break;
            }
        }
    }
    
}

