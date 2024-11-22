
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import question11.PaymentService;
import question11.RiderService;

public class MicroserviceTest {

    @Test
    public void testRiderService() {
        RiderService riderService = new RiderService();
        RiderService.Rider rider = riderService.getRiderDetails("123");

        assertEquals("123", rider.getRiderId());
        assertEquals("John Doe", rider.getName());
        assertEquals("New York", rider.getCity());
    }

    @Test
    public void testPaymentService() {
        PaymentService paymentService = new PaymentService();
        PaymentService.PaymentRequest paymentRequest = new PaymentService.PaymentRequest(25.0, "Credit Card", "123");

        String result = paymentService.processPayment(paymentRequest);
        assertEquals("Payment of 25.0 processed for rider 123", result);
    }
}

