package strategy.pricing;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Price without discount: " + price);
        } else {
            System.out.println("User is signed up for newsletter, choose a different pricing strategy!");
        }
    }
}
