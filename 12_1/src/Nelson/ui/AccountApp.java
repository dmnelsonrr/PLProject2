package Nelson.ui;

import Nelson.Business.CheckingAccount;
import java.util.Scanner;

public class AccountApp{
    public static void main(String args[]){
        //initiate scanner for user input
        Scanner sc = new Scanner(System.in);

        CheckingAccount account = new CheckingAccount();

        Console.displayLine("Welcome to the Account Calculator\n");
        Console.displayLine("Starting Balance");
        Console.displayLine("Checking: "+ account.getBalance());
        Console.displayLine("\nEnter the transactions for the month\n");

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
                if(numAmount>account.getBalance()){
                    System.out.println("Cannot withdraw amount larger than current balance");
                }
                else {
                    account.withdraw(numAmount);
                }
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
                else{
                    account.deposit(numAmount);
                }
                System.out.println("Continue? (y/n):");
                choice = sc.nextLine();

            //return error for invalid choice
            }else{
                System.out.println("Invalid entry.\nContinue? (y/n):");
                choice = sc.nextLine();
            }
        }
        account.subtractMonthlyFee();
        Console.displayLine("Monthly Fees");
        Console.displayLine("Checking Fee: " + account.getMonthlyFeeFormatted());
        Console.displayLine("\nFinal Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());
    }
}
