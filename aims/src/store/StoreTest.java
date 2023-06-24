package aims.src.store;

import aims.src.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Suzume", "Animation", "Shinkai Makoto", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Serial Experiments Lain", "Psychological Thriller", "Ryutaro Nakamura", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Neon Genesis Evangelion", "Mecha", "Hideaki Anno (Gainax)", 100, 23.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Welcome to the Ballroom", "Animation", "Tomo Takeuchi", 87, 33.21f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Night is Short, Walk on Girl", "Romantic Comedy", "Masaaki Yuasa", 94, 37.93f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);

        store.displayStore();

        store.removeMedia(dvd1);
        store.removeMedia(dvd2);

        store.displayStore();
    }
    

}
