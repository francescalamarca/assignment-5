//RIDE VIEW 

package question12;

public class View {
    // View interface
    public interface RideView {
        void displayRideDetails(String source, String destination, double fare);
    }

    // Concrete implementation for Smartphone View
    public class SmartphoneView implements RideView {
        public void displayRideDetails(String source, String destination, double fare) {
            System.out.println("Smartphone View: Ride from " + source + " to " + destination + " with fare " + fare);
        }
    }

    // Concrete implementation for Mobile Web View
    public class MobileWebView implements RideView {
        public void displayRideDetails(String source, String destination, double fare) {
            System.out.println("Mobile Web View: Ride from " + source + " to " + destination + " with fare " + fare);
        }
    }
}
