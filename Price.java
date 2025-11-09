public abstract class Price {
   public abstract int getPriceCode();
   public double getCharge(int daysRented){
      double thisAmount = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
   }
   public int getFrequentRenterPoints(int daysRented) {
       // add frequent renter points
       int frequentRenterPoints = 1;
       // add bonus for a two day new release rental
       if ((getPriceCode() == Movie.NEW_RELEASE) &&
               daysRented > 1) frequentRenterPoints ++;
       return frequentRenterPoints;
   }
}