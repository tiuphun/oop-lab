package aims.src.cart;

import aims.src.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "George Lucas", 87, 18.99f);
        cart.addDigitalVideoDisc(dvd3); 

        cart.printCart();
        cart.searchByID(1);
        cart.searchByTitle("Aladin");
        cart.searchByTitle("Cinderella");
    }
}
