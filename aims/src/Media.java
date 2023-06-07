package aims.src;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Media (String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media other = (Media) obj;
        return this.title.equals(other.title);
    }
}
