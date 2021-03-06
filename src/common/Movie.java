package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Movie  implements Comparable{
    
    private String movieId;
    private String title;
    private String director;
    private String series;

    public Movie() {
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.movieId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", "
                + "director=" + director + ", series=" + series + '}';
    }

    

    @Override
    public int compareTo(Object other) {
         Movie movie = (Movie)other;
        
        // Using a utility from Apache Commons
        return new CompareToBuilder()
               .append(this.movieId, movie.movieId)
//                .append(this.title, movie.title)
//                .append(this.series, movie.series)
               .toComparison();
    }
}
