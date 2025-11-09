import java.util.Enumeration;


public class HtmlStatement extends Statement {
    @Override
    protected String getHeader(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String getDetail(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
               String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    @Override
    protected String getFooter(Customer aCustomer) {
        String result = "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
        return result;
    }
}

/*adicionando esse texto para dar o commit 18 já que o 17 fez o 18 junto 😆 */