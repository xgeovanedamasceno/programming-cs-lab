package diocollection.comparers;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {

    public int compare(Movie m1, Movie mv2) {
         if (m1.getRating() < mv2.getRating()) return -1;
         if (m1.getRating() > mv2.getRating()) return 1;
         else return 0;
     }
}

