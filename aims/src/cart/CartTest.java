package aims.src.cart;

import aims.src.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "George Lucas", 87, 18.99f);
        cart.addMedia(dvd3);

        cart.printCart(cart);
        cart.searchByID(1);
        cart.searchByTitle("Aladdin");
        cart.searchByTitle("Cinderella");
    }
}
