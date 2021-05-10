package strategy.pricing;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Price with 50% discount: " + price/2);
        } else {
            System.out.println("User is not signed up for newsletter, choose a different pricing strategy!");
        }
    }
}
