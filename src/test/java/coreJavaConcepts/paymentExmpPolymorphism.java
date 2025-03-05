package coreJavaConcepts;

abstract class Payment {
    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }
}

class BankTransferPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer payment.");
    }
}

public class paymentExmpPolymorphism {
    public static void main(String[] args) {
        // Using polymorphism to call processPayment() on different payment types
     //   Payment payment;

        // Credit card payment
        Payment   credit = new CreditCardPayment();
        credit.processPayment(); // Output: Processing credit card payment.

        // PayPal payment
        Payment   paypal = new PayPalPayment();
        paypal.processPayment(); // Output: Processing PayPal payment.

        // Bank transfer payment
        Payment  bankTransfer= new BankTransferPayment();
        bankTransfer.processPayment(); // Output: Processing bank transfer payment.
    }
}
