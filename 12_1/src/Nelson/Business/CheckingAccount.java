package Nelson.Business;
import java.text.NumberFormat;

public class CheckingAccount extends Account{
    //initiate instance variable monthly fee with default value
    private double monthlyFee = 1;

    //methods
    void subtractMonthlyFee(){}
    void setMonthlyFee(double monthlyFee){this.monthlyFee = monthlyFee;}
    double getMonthlyFee(){return monthlyFee;}
    String getMonthlyFeeFormatted(){
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return defaultFormat.format(monthlyFee);
    }
}
