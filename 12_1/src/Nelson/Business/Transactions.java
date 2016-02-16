package Nelson.Business;

//import interfaces
import Nelson.Account.Interfaces.Depositable;
import Nelson.Account.Interfaces.Withdrawable;

public class Transactions{
    //methods for depositing and withdrawing
    public static void deposit(Depositable account, double amount){
        account.deposit(amount);
    }
    public static void withdraw(Withdrawable account, double amount){
        account.withdraw(amount);
    }
}
