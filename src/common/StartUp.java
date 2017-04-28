
package common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author roshann
 */
public class StartUp {
    public static void main(String[] args) {
        
        Movie movie1 = new Movie();
        movie1.setMovieId("M00001");
        movie1.setDirector("J. J. Abrams");
        movie1.setTitle("LOST");
        movie1.setSeries("1");
        
        Movie movie2 = new Movie();
        movie2.setMovieId("M00002");
        movie2.setDirector("Frank Darabont,");
        movie2.setTitle("The Walking Dead");
        movie2.setSeries("2");
        
        Movie movie3 = new Movie();
        movie3.setMovieId("M00003");
        movie3.setDirector("James Cameron");
        movie3.setTitle("LOST CITY");
        movie3.setSeries("3");
        
        Movie movie4 = new Movie();
        movie4.setMovieId("M00004");
        movie4.setDirector("Lucas");
        movie4.setTitle("Breaking Bad");
        movie4.setSeries("4");

        Movie movie5 = new Movie();
        movie5.setMovieId("M00005");
        movie5.setDirector("Lucas");
        movie5.setTitle("Breaking Bad");
        movie5.setSeries("4");        
        
        Map<String, Movie> hashMapMovie = new HashMap<String, Movie>(); // edit this!
        hashMapMovie.put("M00002", movie2);
        hashMapMovie.put("M00001", movie1);
        hashMapMovie.put("M00004", movie4);
        hashMapMovie.put("M00003", movie3);
        hashMapMovie.put("M00005", movie5);

        System.out.println("====================unsorted list value=================\n");
        
        Set<String> keys = hashMapMovie.keySet();
        for (String key : keys){
            System.out.println("Key : " + key + " :" + hashMapMovie.get(key));
        }
        
        Map<String, Movie> treeMapMovie = new TreeMap<String, Movie>(); // edit this!
        treeMapMovie.put("M00002", movie2);
        treeMapMovie.put("M00001", movie1);
        treeMapMovie.put("M00004", movie4);
        treeMapMovie.put("M00003", movie3);
        treeMapMovie.put("M00005", movie5);

        System.out.println("\n===================sorted list====================\n");
        
        Set<String> keys1 = treeMapMovie.keySet();
        for (String key1 : keys1){
            System.out.println("Key : " + key1 + " :" + treeMapMovie.get(key1));
        }        
        
        System.out.println("\n===================Move List====================\n");
        Collection<Movie> values = treeMapMovie.values();
        for (Movie movie : values){
            System.out.println("Move : " + movie.toString());
        }     
    }
    
}
