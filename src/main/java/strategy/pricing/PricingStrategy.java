package strategy.pricing;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
