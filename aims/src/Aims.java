package aims.src;

import java.util.Scanner;

public class Aims extends Cart{
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        showMenu(scanner, choice, cart, store);
        scanner.close();
    }

    public static void showMenu(Scanner scanner, int choice, Cart cart, Store store) {
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
                    updateStore(scanner, choice, store);
                    break;
                case 3:
                    cartMenu(scanner, choice, cart);
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
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Play a media");
            System.out.println("3. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                mediaDetailsMenu(scanner, choice, store, cart);
                break;
            case 2:
                playMedia(store);
                break;
            case 3:
                displayCart(cart);
                break;
            case 0:
                showMenu(scanner, choice, cart, store);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }   
        } while (choice != 0);
    }

    public static void updateStore(Scanner scanner, int choice, Store store) {
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
                    addMedia();
                    break;
                case 2:
                    removeMedia();
                    break;
                case 0:
                    showMenu(scanner, choice);
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
                removeMedia();
                break;
            case 4: 
                playMedia(store);
                break;
            case 5:
                placeOrder(cart);
                break;
            case 0:
                showMenu(scanner, choice, cart, store);
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
                playMedia(store);
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

    public static void playMedia(Store store) {
        for (Media item : store.itemsInStore) {
            if (item instanceof Playable) {
                ((Playable) item).play();
            }
        }
    }

    public static void displayCart(Cart cart) {
        cart.printCart(cart);
    }

    public static void addMediaToCart(Scanner scanner, Cart cart, Store store) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        if (store.itemsInStore.contains(title)) {
            Media media = Store.itemsInStore.get(title);
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
                
                break;
            case 2:
                
                break;
            case 0:
                cartMenu(scanner, choice, store, cart);
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
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        } while (choice != 0);
    }

    public static void placeOrder(Cart cart) {
        System.out.println("Order placed!");
        for (Media item : itemsOrdered) {
            item = null;
        }
    }
}
