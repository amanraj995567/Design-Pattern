package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.Enums.City;

import java.util.List;

public class BookMyShow {
    MovieController movieController;
    TheaterController theaterController;


    public BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();
        bookMyShow.createBooking(City.DELHI, "AVENGERS");
    }

    public void createBooking(City userCity, String movieName) {

        // 1. search movie by location
        List<Movie> movies = movieController.getMoviesByCity(userCity);

        Movie interestedMovie = null;
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(movieName)) {
                interestedMovie = movie;
                break;
            }
        }
        if (interestedMovie == null) {
            System.out.println("Movie not available in " + userCity);
            return;
        }

        // 2. get all shows of this movie in theaters of that city
        Map<Theater, List<Show>> showsTheaterWise =
                theaterController.getAllShow(interestedMovie, userCity);

        if (showsTheaterWise == null || showsTheaterWise.isEmpty()) {
            System.out.println("No shows available for " + movieName + " in " + userCity);
            return;
        }

        // 3. pick a theater and one of its shows (here: first available)
        Map.Entry<Theater, List<Show>> entry = showsTheaterWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        if (runningShows.isEmpty()) {
            System.out.println("No running shows.");
            return;
        }
        Show interestedShow = runningShows.get(0);

        // 4. pick a seat (here: hardcoded seat number 30)
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();

        if (!bookedSeats.contains(seatNumber)) {
            // 5. seat is free -> book it
            bookedSeats.add(seatNumber);

            // create the booking object
            Booking booking = new Booking();
            booking.setShow(interestedShow);

            // find the actual Seat object for the price/category if needed
            List<Seat> seats = interestedShow.getScreen().getSeats();
            Seat bookedSeat = null;
            for (Seat seat : seats) {
                if (seat.getSeatId() == seatNumber) {
                    bookedSeat = seat;
                    break;
                }
            }
            booking.setBookedSeats(List.of(bookedSeat));

            System.out.println("Booking successful! Seat " + seatNumber +
                    " for " + movieName + " in " + userCity);
        } else {
            System.out.println("Seat " + seatNumber + " already booked. Try another.");
        }
    }

    public  void initialize(){
        createMovies();
        createTheater();
    }

    private void createTheater() {
        // theater 1
        Theater inoxDelhi = new Theater();
        inoxDelhi.setTheaterId(1);
        inoxDelhi.setCity(City.DELHI);
        inoxDelhi.setScreen(createScreen());

        // theater 2
        Theater pvrAgra = new Theater();
        pvrAgra.setTheaterId(2);
        pvrAgra.setCity(City.AGRA);
        pvrAgra.setScreen(createScreen());

        theaterController.addTheater(inoxDelhi, City.DELHI);
        theaterController.addTheater(pvrAgra, City.AGRA);
    }

    private  void createMovies(){
        //create movie 1
        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setName("AVENGERS");
        avengers.setMovieDurationInMinutes(120);

        // movie 2
        Movie fun = new Movie();
        fun.setMovieId(2);
        fun.setName("FUN");
        fun.setMovieDurationInMinutes(180);


        movieController.addMovie(avengers, City.DELHI);
        movieController.addMovie(avengers, City.LEH);
        movieController.addMovie(fun, City.PATNA);
        movieController.addMovie(fun, City.AGRA);


    }
}
