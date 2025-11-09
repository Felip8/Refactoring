import java.util.Enumeration;

public abstract class Statement {
    
    protected abstract String getHeader(Customer aCustomer);
    protected abstract String getDetail(Rental aRental);
    protected abstract String getFooter(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeader(aCustomer); // Usa o método polimórfico

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += getDetail(each); // Usa o método polimórfico
        }

        // add footer lines
        result += getFooter(aCustomer); // Usa o método polimórfico
        return result;
    }
}