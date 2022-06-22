import java.util.Enumeration;

public class HtmlStatement extends Statement{
    public String getFirstResult(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String getSecondResult(Rental each_){
        return each_.getMovie().getTitle()+ ": " +
            String.valueOf(each_.getCharge()) + "<BR>\n";
    }

    public String getThirdResult(Customer aCustomer){
        return "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String getFourthResult(Customer aCustomer){
        return "On this rental you earned <EM>" + 
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
    }
}
