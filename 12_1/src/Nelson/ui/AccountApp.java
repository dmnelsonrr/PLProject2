package Nelson.ui;
import java.util.Scanner;

public class AccountApp{
    public static void main(String args[]){
        //initiate scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Account Calculator\n");
        System.out.println("Starting Balance:");
        System.out.println("Checking:");
        System.out.println("Enter the transactions for the month\n");

        String choice = "y";
        //while loop while user chooses y to continue
        while(choice.equalsIgnoreCase("y")){
            String inputAmount;
            double numAmount;
            //ask for user input and store
            System.out.println("Withdrawal or deposit? (w/d):");
            String input = sc.nextLine();

            //withdraw
            if(input.equalsIgnoreCase("w")){
                System.out.println("Amount:");
                inputAmount = sc.nextLine();
                numAmount = Double.parseDouble(inputAmount);
                System.out.println("Continue? (y/n):");
                choice = sc.nextLine();

            //deposit
            }else if(input.equalsIgnoreCase("d")){
                System.out.println("Amount:");
                inputAmount = sc.nextLine();
                numAmount = Double.parseDouble(inputAmount);
                if(numAmount>=10000){
                    System.out.println("Cannot deposit more than $10,000");
                }
                System.out.println("Continue? (y/n):");
                choice = sc.nextLine();

            //return error for invalid choice
            }else{
                System.out.println("Invalid entry.\nContinue? (y/n):");
                choice = sc.nextLine();
            }
        }
        System.out.print("Bye!");
    }
}
