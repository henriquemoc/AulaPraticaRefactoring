import java.util.Enumeration;

public abstract class Statement {
    public abstract String getFirstResult(Customer aCustomer);
    public abstract String getSecondResult(Rental each_);
    public abstract String getThirdResult(Customer aCustomer);
    public abstract String getFourthResult(Customer aCustomer);

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
}
