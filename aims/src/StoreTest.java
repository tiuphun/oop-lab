package aims.src;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Suzume", "Animation", "Shinkai Makoto", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Serial Experiments Lain", "Psychological Thriller", "Ryutaro Nakamura", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Neon Genesis Evangelion", "Mecha", "Hideaki Anno (Gainax)", 100, 23.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Welcome to the Ballroom", "Animation", "Tomo Takeuchi", 87, 33.21f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Night is Short, Walk on Girl", "Romantic Comedy", "Masaaki Yuasa", 94, 37.93f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        store.addDVD(dvd5);

        store.displayStore();

        store.removeDVD(1);
        store.removeDVD(2);

        store.displayStore();
    }
    

}
