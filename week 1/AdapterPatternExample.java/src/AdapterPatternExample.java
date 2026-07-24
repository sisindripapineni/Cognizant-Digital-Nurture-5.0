// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee
class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed using PayPal.");
    }
}

// Adapter
class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway payPalGateway;

    public PayPalAdapter() {
        payPalGateway = new PayPalGateway();
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}

// Main Class
public class AdapterPatternExample {

    public static void main(String[] args) {

        PaymentProcessor payment = new PayPalAdapter();

        payment.processPayment(2500.0);

    }
}
