package aims.src;
public class DigitalVideoDisc extends Media implements Playable{
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }
    
    public DigitalVideoDisc() {
        super("Untitled", "Other", 0.0f, nbDigitalVideoDiscs);
        director = null;
        length = 0;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title) {
        super(title, "Other", 0.0f, nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String category, String title, float cost) {
        super(title, category, cost, nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(title, category, cost, nbDigitalVideoDiscs);
        this.director = director;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, nbDigitalVideoDiscs);
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
    }
    
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
