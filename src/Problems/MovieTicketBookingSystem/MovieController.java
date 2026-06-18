package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    public Map<City, List<Movie>> getCityVsMovie() {
        return cityVsMovie;
    }

    public void setCityVsMovie(Map<City, List<Movie>> cityVsMovie) {
        this.cityVsMovie = cityVsMovie;
    }

    public List<Movie> getAllMovies() {
        return allMovies;
    }

    public void setAllMovies(List<Movie> allMovies) {
        this.allMovies = allMovies;
    }

    Map<City, List<Movie>>cityVsMovie;
    List<Movie>allMovies;

    MovieController(){
        cityVsMovie = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {

    }

    public List<Movie> getMoviesByCity(City userCity) {
        return getCityVsMovie(userCity);
    }
}
