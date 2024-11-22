// FareCalcTest.java
import org.junit.jupiter.api.Test;

import question12.model.FareCalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FareCalcTest {

    @Test
    public void testCalculateStandardFare() {
        FareCalc fareCalculator = new FareCalc();
        assertEquals(40.0, fareCalculator.calculateStandardFare(15.0));
    }

    @Test
    public void testCalculatePremiumFare() {
        FareCalc fareCalculator = new FareCalc();
        assertEquals(55.0, fareCalculator.calculatePremiumFare(15.0));
    }
}
