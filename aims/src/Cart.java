package aims.src;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full!\n");
            return;
        }
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered = qtyOrdered + 1;
            System.out.println("The disc has been added.\n");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered == 0) {
        System.out.println("Your cart is empty!\n");
        return;
    }
    else {
        int indexToRemove = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("The disc is not in the cart!\n");
            return;
        }
        else {
            for (int i = indexToRemove; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc " + disc.getTitle() + " has been removed.\n");
            System.out.println("Discs remain in the cart:");
            for (int i = 0; i < qtyOrdered; i++) {
                System.out.println(itemsOrdered[i].getTitle());
            }
        }
    }
}

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }

    public String toString() {
        String s = "***********************CART***********************\n";
        s = s + "Ordered items:\n";
        for (int i = 0; i < qtyOrdered; i++) {
            s = s + i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$\n";
        }
        s = s + "Total cost: " + totalCost() + "$\n";
        s = s + "***************************************************\n";
        return s;
    }

    public void searchByID(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found the disc:");
                System.out.println(itemsOrdered[i].getTitle());
                return;
            }
        }
        System.out.println("Disc not found!");
    }

    public void searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("Found the disc:");
                System.out.println(itemsOrdered[i].getTitle());
                return;
            }
        }
        System.out.println("Disc not found!");
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total = total + itemsOrdered[i].getCost();
        }
        return total;
    }
}
