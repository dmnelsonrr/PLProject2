package Nelson.business;

// establish a customer
public class Customer extends Person {

    private double customerNumber;

    public Customer() {
        customerNumber = 0;
    }

    public void setCustomerNumber(double customerNumber){ this.customerNumber = customerNumber;}
    public double getCustomerNumber() { return customerNumber;}

    // Override the abstract print method
    public String getDisplayText() {
        return super.toString() + "\n Customer number: " + customerNumber;
    }

}
