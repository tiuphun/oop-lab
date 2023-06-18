package aims.src.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getCost() > o2.getCost()) {
            return -1; // o1 is ranked higher
        } else if (o1.getCost() < o2.getCost()) {
            return 1; // o2 is ranked higher
        } else {
            // if the cost is the same, compare the title alphabetically
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
