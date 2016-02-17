package Nelson.business;

public abstract class Person {

    private String first_name;
    private String last_name;
    private String email_address;

    public Person() {
        first_name = "";
        last_name = "";
        email_address = "";

    }

    public void setFirst_name(String first_name) {this.first_name = first_name;}
    public String getFirst_name() { return first_name;}
    public void setLast_name(String last_name) {this.last_name = last_name;}
    public String getLast_name() { return last_name;}
    public void setEmail_address(String email_address) {this.email_address = email_address;}
    public String getEmail_address() {return email_address;}

    public String toString() {
        return "Name: " + first_name + " " + last_name + "\nE-mail: " + email_address;
    }

}
