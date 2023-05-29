package aims.src;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // GETTERS
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public int getId() {
        return 0;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }
    
    // CONSTUCTORS
    public DigitalVideoDisc() {
        title = "Untitled";
        category = "Other";
        director = null;
        length = 0;
        cost = 0.0f;
    }
    
    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
    
}
