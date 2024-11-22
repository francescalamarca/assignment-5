import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import question12.Controller;
import question12.Ride;
import question12.View;
import question12.View.SmartphoneView;
import question12.View.MobileWebView;

public class RideControllerTest {

    @Test
    public void testSmartphoneView() {
        // Capture the output from the smartphone view
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //create an outer class instance and tghen the inner class
        View view = new View();
        Ride ride = new Ride("Downtown", "Airport", 25.0);
        Controller controller = new Controller(ride);
        SmartphoneView s = view.new SmartphoneView();
        controller.setViewStrategy(s);
        controller.showRideDetails();

        String expectedOutput = "Smartphone View: Ride from Downtown to Airport with fare 25.0\n";
        assertTrue(outputStream.toString().contains(expectedOutput));
    }

    @Test
    public void testMobileWebView() {
        // Capture the output from the mobile web view
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        View view = new View();
        Ride ride = new Ride("Downtown", "Airport", 25.0);
        Controller controller = new Controller(ride);
        controller.setViewStrategy(view.new MobileWebView());
        controller.showRideDetails();

        String expectedOutput = "Mobile Web View: Ride from Downtown to Airport with fare 25.0\n";
        assertTrue(outputStream.toString().contains(expectedOutput));
    }
}
