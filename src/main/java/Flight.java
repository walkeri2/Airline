import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private String number;
    private String destination;
    private String departPort;
    private String departTime;

    public Flight(String number, String destination, String departPort, String departTime){
        this.passengers = new ArrayList<Passenger>();
        this.number = number;
        this.destination = destination;
        this.departPort = departPort;
        this.departTime = departTime;
    }

    public int seatsAvailable(){ return PlaneType.BOING747.getCapacityFromEnum();}

    public int numberOfPassengers(){ return this.passengers.size();}

    public void addPassenger(Passenger passenger){
        if (this.seatsAvailable() > this.numberOfPassengers());{
            this.passengers.add(passenger);
        }
    }

}
