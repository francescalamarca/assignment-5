//simulates what connection to a server like springboot would look like
package question11;


public class MicroserviceClient {
    public static void main(String[] args) {
        RiderService riderService = new RiderService();
        PaymentService paymentService = new PaymentService();

        // Simulating fetching rider details
        RiderService.Rider rider = riderService.getRiderDetails("123");
        System.out.println("Rider details: " + rider.getName() + " from " + rider.getCity());

        // Simulating payment process
        PaymentService.PaymentRequest paymentRequest = new PaymentService.PaymentRequest(25.0, "Credit Card", "123");
        String paymentResponse = paymentService.processPayment(paymentRequest);
        System.out.println(paymentResponse);
    }
}