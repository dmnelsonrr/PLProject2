package Nelson.Business;
import java.text.NumberFormat;

public class CheckingAccount extends Account{
    //initiate instance variable monthly fee with default value
    private double monthlyFee;

    //constructor
    public CheckingAccount(){
        super();
        monthlyFee = 1;
    }

    //methods
    public void subtractMonthlyFee(){this.balance = balance - monthlyFee;}
    void setMonthlyFee(double monthlyFee){this.monthlyFee = monthlyFee;}
    public double getMonthlyFee(){return monthlyFee;}
    public String getMonthlyFeeFormatted(){
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return defaultFormat.format(monthlyFee);
    }
}
