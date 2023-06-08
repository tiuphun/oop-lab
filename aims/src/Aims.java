package aims.src;

import java.util.Scanner;

public class Aims extends Cart{
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        showMenu(scanner, choice, store, cart);
        scanner.close();
    }

    public static void showMenu(Scanner scanner, int choice, Store store, Cart cart) {
        do {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    storeMenu(scanner, choice, store, cart);
                    break;
                case 2:
                    updateStore(scanner, choice, store, cart);
                    break;
                case 3:
                    cartMenu(scanner, choice, store, cart);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    public static void storeMenu(Scanner scanner, int choice, Store store, Cart cart) {
        store.displayStore();
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                mediaDetailsMenu(scanner, choice, store, cart);
                break;
            case 2:
                addMediaToCart(scanner, cart, store);
                break;
            case 3:
                playMedia(scanner, store);
                break;
            case 4:
                displayCart(cart);
                break;
            case 0:
                showMenu(scanner, choice, store, cart);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }   
        } while (choice != 0);
    }

    public static void updateStore(Scanner scanner, int choice, Store store, Cart cart) {
            do {
                System.out.println("Options: ");
                System.out.println("--------------------------------");
                System.out.println("1. Add a new media");
                System.out.println("2. Remove a media");
                System.out.println("0. Back");
                System.out.println("--------------------------------");
                System.out.println("Please choose a number: 0-1-2");

                choice = scanner.nextInt();

                switch (choice) {
                case 1:
                    addMediaToStore(scanner, store, cart);
                    break;
                case 2:
                    removeMediaFromStore(scanner, store, cart);
                    break;
                case 0:
                    showMenu(scanner, choice, store, cart);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            } while (choice != 0);
        }

    public static void cartMenu(Scanner scanner, int choice, Store store, Cart cart) {
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart"); 
            System.out.println("2. Sort medias in cart"); 
            System.out.println("3. Remove media from cart"); 
            System.out.println("4. Play a media"); 
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                filterMedia(scanner, choice, store, cart);
                break;
            case 2:
                sortMedia(scanner, choice, store, cart);
                break;
            case 3:
                removeMediaFromCart(scanner, store, cart);
                break;
            case 4: 
                playMedia(scanner, store);
                break;
            case 5:
                placeOrder(cart);
                break;
            case 0:
                showMenu(scanner, choice, store, cart);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        } while (choice != 0);
    }

    public static void mediaDetailsMenu(Scanner scanner, int choice, Store store, Cart cart) {
        do {
            System.out.println("Options: "); 
            System.out.println("--------------------------------"); 
            System.out.println("1. Add to cart"); 
            System.out.println("2. Play"); 
            System.out.println("0. Back"); 
            System.out.println("--------------------------------"); 
            System.out.println("Please choose a number: 0-1-2"); 

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                addMediaToCart(scanner, cart, store);
                break;
            case 2:
                playMedia(scanner, store);
                break;
            case 0:
                storeMenu(scanner, choice, store, cart);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        } while (choice != 0);
    }   

    public static void playMedia(Scanner scanner, Store store) {
        String title = getTitleFromUser(scanner, store);
        if (store.getItemsInStore().contains(title)) {
            Media media = Store.getItemsInStore().get(title);
            if (media instanceof CompactDisc) {
                CompactDisc cd = (CompactDisc) media;
                cd.play();
            } else if (media instanceof DigitalVideoDisc) {
                DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                dvd.play();
            } else {
                System.out.println("Media is not playable!");
            }
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void displayCart(Cart cart) {
        cart.printCart(cart);
    }

    public static void addMediaToCart(Scanner scanner, Cart cart, Store store) {
        String title = getTitleFromUser(scanner, store);
        if (store.getItemsInStore().contains(title)) {
            Media media = Store.getItemsInStore().get(title);
            cart.addMedia(media);
        } else {
            System.out.println("Media not found!");
        }
    }
    
    public static void filterMedia(Scanner scanner, int choice, Store store, Cart cart) {
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter by id");
            System.out.println("2. Filter by title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                int id = getIdFromUser(scanner, store);
                cart.searchByID(id);
                break;
            case 2:
                String title = getTitleFromUser(scanner, store);
                cart.searchByTitle(title);
                break;
            case 0:
                cartMenu(scanner, choice, store, cart);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        } while (choice != 0);
    }

    public static void sortMedia(Scanner scanner, int choice, Store store, Cart cart) {
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort by title");
            System.out.println("2. Sort by cost");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 0:
                cartMenu(scanner, choice, store, cart);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        } while (choice != 0);
    }

    public static void placeOrder(Cart cart) {
        System.out.println("Order placed!");
        cart = null;
    }

    public static void addMediaToStore(Scanner scanner, Store store, Cart cart) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        System.out.println("Enter the category of the media: ");
        String category = scanner.nextLine();
        System.out.println("Enter the cost of the media: ");
        float cost = scanner.nextFloat();
        System.out.println("Enter the id of the media: ");
        int id = scanner.nextInt();
        Media media = chooseMediaClass(scanner, store, cart, title, category, cost, id);
        store.addMedia(media);
    }

    public static void removeMediaFromStore(Scanner scanner, Store store, Cart cart) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        System.out.println("Enter the category of the media: ");
        String category = scanner.nextLine();
        System.out.println("Enter the cost of the media: ");
        float cost = scanner.nextFloat();
        System.out.println("Enter the id of the media: ");
        int id = scanner.nextInt();
        
        Media media = chooseMediaClass(scanner, store, cart, title, category, cost, id);
        store.removeMedia(media);
    }

    public static void removeMediaFromCart(Scanner scanner, Store store, Cart cart) {
        String title = getTitleFromUser(scanner, store);
        Media media = cart.getItemsOrdered().get(title);
        cart.removeMedia(media);
    }

    public static Media chooseMediaClass(Scanner scanner, Store store, Cart cart, String title, String category, float cost, int id) {
        int choice = -1;
        do {
            System.out.println("Which type of media do you want to add?");
            System.out.println("--------------------------------");
            System.out.println("1. Book");
            System.out.println("2. Compact Disc");
            System.out.println("3. Digital Video Disc");
            System.out.println("0. Back");
            System.out.println("--------------------------------");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                Media book = new Book(title, category, cost, id);
                return book;
            case 2:
                Media cd = new CompactDisc(title, category, cost, id);
                return cd;
            case 3:
                Media dvd = new DigitalVideoDisc(title, category, cost, id);
                return dvd;
            case 0:
                updateStore(scanner, choice, store, cart);
                return null;
            default:
                System.out.println("Invalid choice. Please try again.");
                return null;
            }
        } while (choice != 0);
    }

    public static String getTitleFromUser(Scanner scanner, Store store) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        if (store.getItemsInStore().get(title) == null) {
            System.out.println("Media not found!");
            return null;
        }
        return title;
    }

    public static int getIdFromUser(Scanner scanner, Store store) {
        System.out.println("Enter the id of the media: ");
        int id = scanner.nextInt();
        if (store.getItemsInStore().get(id) == null) {
            System.out.println("Media not found!");
            return -1;
        }
        return id;
    }
}
