public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full!\n");
            return;
        }
        else {
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
            qtyOrdered = qtyOrdered - 1;
            System.out.println("The disc has been removed.\n");
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total = total + itemsOrdered[i].getCost();
        }
        return total;
    }
}
