package question12;
// model view controller take on the uber app

public class Ride {
    private String source;
    private String destination;
    private double fare;

    public Ride(String source, String destination, double fare) {
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    // Getters
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public double getFare() { return fare; }
}



