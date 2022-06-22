import java.util.Enumeration;

public class HtmlStatement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFirstResult(aCustomer);
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for each rental
           result += getSecondResult(each);
        }
        //add footer lines
        result += getThirdResult(aCustomer);
        result += getFourthResult(aCustomer);
        return result;
    }

    private String getFirstResult(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    private String getSecondResult(Rental each_){
        return each_.getMovie().getTitle()+ ": " +
            String.valueOf(each_.getCharge()) + "<BR>\n";
    }

    private String getThirdResult(Customer aCustomer){
        return "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    private String getFourthResult(Customer aCustomer){
        return "On this rental you earned <EM>" + 
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
    }
}
