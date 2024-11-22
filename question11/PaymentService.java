package question11;

public class PaymentService {
    public String processPayment(PaymentRequest request) {
        // Simulating payment processing (no real transactions)
        return "Payment of " + request.getAmount() + " processed for rider " + request.getRiderId();
    }

    public static class PaymentRequest {
        private double amount;
        private String paymentMethod;
        private String riderId;

        public PaymentRequest(double amount, String paymentMethod, String riderId) {
            this.amount = amount;
            this.paymentMethod = paymentMethod;
            this.riderId = riderId;
        }

        public double getAmount() {
            return amount;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public String getRiderId() {
            return riderId;
        }
    }
}


