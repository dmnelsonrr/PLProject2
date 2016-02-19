package Nelson.Business;

import Nelson.Account.Interfaces.Balanceable;
import Nelson.Account.Interfaces.Depositable;
import Nelson.Account.Interfaces.Withdrawable;
import java.text.NumberFormat;

public class Account implements Depositable, Balanceable, Withdrawable{

    //initialize every instance of class Account
    public double balance = 1000;

    //implement interfaces
    public void deposit(double amount){balance = balance + amount;}
    public void withdraw(double amount){balance = balance - amount;}
    public double getBalance(){return balance;}
    public void setBalance(double amount){balance = amount;}

    public String getBalanceFormatted(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return(formatter.format(balance));
    }
}
