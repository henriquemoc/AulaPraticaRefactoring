import java.util.Enumeration;

public class TextStatement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFirstResult(aCustomer);
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for this rental
           result += getSecondResult(each);
        }
        //add footer lines
        result += getThirdResult(aCustomer);
        result += getFourthResult(aCustomer);
        return result;
    }

    private String getFirstResult(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String getSecondResult(Rental each_){
        return "\t" + each_.getMovie().getTitle()+ "\t" + 
            String.valueOf(each_.getCharge()) + "\n";
    }

    private String getThirdResult(Customer aCustomer){
        return "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    private String getFourthResult(Customer aCustomer){
        return "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
    }
}
