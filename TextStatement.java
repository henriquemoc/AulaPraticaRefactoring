import java.util.Enumeration;

public class TextStatement extends Statement{


    public String getFirstResult(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String getSecondResult(Rental each_){
        return "\t" + each_.getMovie().getTitle()+ "\t" + 
            String.valueOf(each_.getCharge()) + "\n";
    }

    public String getThirdResult(Customer aCustomer){
        return "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String getFourthResult(Customer aCustomer){
        return "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
    }
}
