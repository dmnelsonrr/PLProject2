
package Nelson.ui;

import Nelson.business.Customer;
import Nelson.business.Employee;
import java.io.*;

// The screen class what is presented on the screen

public class PersonApp {

    public static void main(String[] args) {

        // use console to print to the screen
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        String choice = "y";


        while (choice.equalsIgnoreCase("y")) {
              String personChoice = Console.getString("Create customer or employee? (c/e): ");

                // Set the data

                if (personChoice.equalsIgnoreCase("c")) {

                    Customer customer = new Customer();
                    String firstName = Console.getString("Enter first name: ");
                    customer.setFirst_name(firstName);
                    String lastName = Console.getString("Enter last name: ");
                    customer.setLast_name(lastName);
                    String emailAddress = Console.getString("Enter e-mail address: ");
                    customer.setEmail_address(emailAddress);
                    double customerNumber = Console.getDouble("Customer number:  ");
                    customer.setCustomerNumber(customerNumber);
                    Console.displayLine();

                    Console.displayLine("You entered:");
                    Console.displayLine(customer.getDisplayText());
                    Console.displayLine();
                }
                else {

                    Employee employee = new Employee();
                    String firstName = Console.getString("Enter first name: ");
                    employee.setFirst_name(firstName);
                    String lastName = Console.getString("Enter last name: ");
                    employee.setLast_name(lastName);
                    String emailAddress = Console.getString("Enter e-mail address: ");
                    employee.setEmail_address(emailAddress);
                    double socialSecurityNumber = Console.getDouble("Social security number:  ");
                    employee.setSocialSecurity(socialSecurityNumber);

                    Console.displayLine("You entered:");
                    Console.displayLine(employee.getDisplayText());
                    Console.displayLine();

            }

            choice = Console.getString("Continue? (y/n): ");

        }

        Console.displayLine("Bye!");
    }

}
