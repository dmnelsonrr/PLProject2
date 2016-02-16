package Nelson.Business;

import java.text.NumberFormat;
import Nelson.Account.Interfaces.Balanceable;
import Nelson.Account.Interfaces.Depositable;
import Nelson.Account.Interfaces.Withdrawable;

public class Account implements Depositable, Balanceable, Withdrawable{

    //initialize every instance of class Account
    private double balance = 1000;

    //implement interfaces
    public void deposit(double amount){balance = balance + amount;}
    public void withdraw(double amount){balance = balance - amount;}
    public double getBalance(){return balance;}
    public void setBalance(double amount){balance = amount;}

    String getBalanceFormatted(){
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return defaultFormat.format(balance);
    }
}
