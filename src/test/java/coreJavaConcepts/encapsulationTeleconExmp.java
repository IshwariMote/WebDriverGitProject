package coreJavaConcepts;
class Customer {
    // Private fields
    private String phoneNumber;
    private String planType;
    private double balance;

    // Constructor to initialize fields
    public Customer(String phoneNumber, String planType, double balance) {
        this.phoneNumber = phoneNumber;
        this.planType = planType;
        this.balance = balance;
    }

    // Public getter and setter methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public double getBalance() {
        return balance;
    }

    public void recharge(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Recharged successfully. New balance: " + this.balance);
        } else {
            System.out.println("Invalid recharge amount!");
        }
    }

    // Display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Details:");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Plan Type: " + planType);
        System.out.println("Balance: " + balance);
    }
}

// Main class to demonstrate encapsulation
public class encapsulationTeleconExmp {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer("9876543210", "Postpaid", 250.0);

        // Display customer details
        customer.displayCustomerDetails();

        // Recharge the customer account
        customer.recharge(100.0);

        // Update plan type using setter
        customer.setPlanType("Prepaid");
        System.out.println("Updated Plan Type: " + customer.getPlanType());

        // Display updated customer details
        customer.displayCustomerDetails();
    }
}
