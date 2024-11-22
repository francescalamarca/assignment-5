import question12.MCView;
import question12.MVCController;
import question12.model.FareCalc;
import question12.model.MVC;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    private MVC ride;
    private FareCalc fareCalculator;
    private MCView rideView;
    private MVCController rideController;

    @BeforeEach
    public void setUp() {
        ride = new MVC("Downtown", "Airport", 15.0);
        fareCalculator = new FareCalc();          // Use real FareCalc
        rideView = new MCView();                  // Use real MCView
        rideController = new MVCController(ride, fareCalculator, rideView);
    }

    @Test
    public void testUpdateView() {
        // Capture output to check what is printed to the console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        rideController.updateView();

        String expectedOutput = "Ride from Downtown to Airport with distance: 15.0\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testCalculateAndDisplayFareStandard() {
        // Test for standard fare calculation
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        rideController.calculateAndDisplayFare("standard");

        // The expected standard fare is 15.0 * 2.5 = 37.5
        String expectedOutput = "The fare is: 37.5\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testCalculateAndDisplayFarePremium() {
        // Test for premium fare calculation
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        rideController.calculateAndDisplayFare("premium");

        // The expected premium fare is 15.0 * 3.5 = 52.5
        String expectedOutput = "The fare is: 52.5\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
