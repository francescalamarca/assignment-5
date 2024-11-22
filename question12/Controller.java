package question12;

import question12.Ride;
import question12.View;

// Context: The Controller that decides which strategy to use
public class Controller {
    private Ride ride;
    private View rideView;

    public Controller(Ride ride) {
        this.ride = ride;
    }

    public void setViewStrategy(View rideView) {
        this.rideView = rideView;
    }

    public void showRideDetails() {
        rideView.displayRideDetails(ride.getSource(), ride.getDestination(), ride.getFare());
    }
}


