package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theater>>cityVsTheater;
    List<Theater>allTheaters;

    public Map<City, List<Theater>> getCityVsTheater() {
        return cityVsTheater;
    }

    public void setCityVsTheater(Map<City, List<Theater>> cityVsTheater) {
        this.cityVsTheater = cityVsTheater;
    }

    public List<Theater> getAllTheaters() {
        return allTheaters;
    }

    public void setAllTheaters(List<Theater> allTheaters) {
        this.allTheaters = allTheaters;
    }

    TheaterController(){
        cityVsTheater = new HashMap<>();
        allTheaters = new ArrayList<>();
    }

}
