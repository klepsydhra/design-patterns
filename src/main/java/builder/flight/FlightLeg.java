package builder.flight;

public class FlightLeg {

    private final String from;
    private final String to;
    private boolean delayed = false;
    private Integer price;

    public FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.price = flightLegBuilder.price;
        setDelayed(delayed);
    }

    private void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{from = " + this.from +
                ", to = " + this.to +
                ", price = " + this.price +
                ", delayed = " + this.delayed +
                "}";
    }

    public static class FlightLegBuilder {

        private final String from;
        private final String to;
        private Integer price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (this.price == null) {
                System.out.println("Price value cannot be null");
            }
            return new FlightLeg(this);
        }
    }
}
