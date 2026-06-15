public class Booking{
    private Passenger passenger;
    private Flight flight;

    public Booking(Passenger passenger, Flight flight){
        this.passenger = passenger;
        this.flight = flight;
    }
    public Passenger getPassenger(){
        return passenger;
    }
    public Flight getFlight(){
        return flight;
    }

    public String toString(){
        return passenger.getName() + "booking flight " + flight.getFlightNumber();
    }
}