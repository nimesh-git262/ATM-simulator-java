import java.util.ArrayList;

public class AirlineSystem{
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;

    public AirlineSystem(){
        flights = new ArrayList<>();
        bookings = new ArrayList<>();

        flights.add(new Flight("QN12", "Delhi", "Dubai", 40));
        flights.add(new Flight("DL54", "Mumbai", "New York", 20));
        flights.add(new Flight("NY4", "New York", "London", 25));
    }

    public void viewFlights(){
        for(Flight flight : flights){
            System.out.println("---------");
            System.out.println(flight);
        }
    }
    public Flight searchFlight(String flightNumber){
        for(Flight flight : flights){
            if(flight.getFlightNumber().equalsIgnoreCase(flightNumber)){
                return flight;
            }
        }
        return null;
    }
    public void bookTicker(String name, String passportNumber, String flightNumber){
        Flight flight = searchFlight(flightNumber);
        if(flight == null){
            System.out.println("Flight not available");
            return;
        }
        if(flight.getAvailableSeat()<=0){
            System.out.println("No seats available");
            return;
        }

        Passenger passenger = new Passenger(name, passportNumber);
        Booking booking = new Booking(passenger, flight);

        bookings.add(booking);
        flight.bookSeat();
        System.out.println("Ticket booked successfully");
    }
    
    public void viewBookings(){
        if(bookings.isEmpty()){
            System.out.println("No bookings found");
            return;
        }
        for(Booking booking : bookings){
            System.out.println(booking);
        }
    }
    public void cancelBooking(String passportNumber){
        for(int i=0; i<bookings.size(); i++){
            Booking booking = bookings.get(i);

            if(booking.getPassenger().getPassportNumber().equalsIgnoreCase(passportNumber)){

            booking.getFlight().cancelSeat();
            bookings.remove(booking);

            System.out.println("Booking Canelled");
            return;
            }
        }
        System.out.println("Booking not found");
    }
    
}    