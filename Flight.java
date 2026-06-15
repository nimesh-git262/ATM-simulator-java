public class Flight{
    private String flightNumber;
    private String source;
    private String destination;
    private int availableSeats;

    public Flight(String flightNumber, String source, String destination, int availableSeats){
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }
    
    public String getFlightNumber(){
        return flightNumber;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public int getAvailableSeat(){
        return availableSeats;
    }
    public void bookSeat(){
        if (availableSeats > 0) {
            availableSeats--;
        }
    }
    public void cancelSeat(){
        availableSeats++;
    }

    public String toString(){
        return "flight Number: " + flightNumber + "Source: " + source + "Destination: " + destination + "Available Seat: " + availableSeats;
    }
}