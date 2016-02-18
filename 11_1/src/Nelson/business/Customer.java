package Nelson.business;

// establish a customer
public class Customer extends Person {

    private String customerNumber;

    public Customer() {
        customerNumber = "";
    }

    public void setCustomerNumber(String customerNumber){ this.customerNumber = customerNumber;}
    public String getCustomerNumber() { return customerNumber;}

    // Override the abstract print method
    @Override
    public String getDisplayText() {
        return super.toString() + "\nCustomer number: " + customerNumber;
    }

}
