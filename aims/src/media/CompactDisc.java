package aims.src.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, float cost, int id) {
        super(title, category, cost, id);
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists!");
        } else {
            tracks.add(track);
            System.out.println("Track added!");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed!");
        } else {
            System.out.println("Track does not exist!");
        }
    }
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }

    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
}
