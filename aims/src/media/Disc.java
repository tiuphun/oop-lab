package aims.src.media;

public class Disc extends Media {
    private int length;
    private String director;

    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }

    public Disc(String title, String category, float cost, int id) {
        super(title, category, cost, id);
    }
    
}
