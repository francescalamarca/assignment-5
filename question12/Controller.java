package question12;

// Context: The Controller that decides which strategy to use
public class Controller {
    private Ride ride;
    private View.RideView rideView;

    public Controller(Ride ride) {
        this.ride = ride;
    }

    public void setViewStrategy(View.RideView rideView) {
        this.rideView = rideView;
    }

    public void showRideDetails() {
        rideView.displayRideDetails(ride.getSource(), ride.getDestination(), ride.getFare());
    }
}


