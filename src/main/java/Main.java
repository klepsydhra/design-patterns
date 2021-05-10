import builder.flight.FlightLeg;
import facade.bank.AtmMachineFacade;
import factory.car.BMWModel;
import factory.car.Car;
import factory.car.CommonwealthFactory;
import factory.car.ContinentalFactory;
import factory.car.Factory;
import factory.car.FordModel;
import flyweight.chess.BlackPiece;
import flyweight.chess.BlackQueen;
import flyweight.chess.ChessPiece;
import flyweight.chess.WhitePiece;
import flyweight.chess.WhiteQueen;
import singleton.game.GuessGame;
import strategy.PriceCalculator;
import strategy.pricing.RegularPrice;
import strategy.pricing.SalePrice;

public class Main {

    public static void main(String[] args) {

        //Builder
        System.out.println("\n**** Builder design pattern ****\n");

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();
        System.out.println(leg);

        leg.setPrice(400);
        System.out.println(leg);

        FlightLeg legWithoutPrice = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").build();

        //Factory
        System.out.println("\n**** Factory design pattern ****\n");

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());

        //Facade
        System.out.println("\n**** Facade design pattern ****\n");

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

        //Flyweight
        System.out.println("\n**** Flyweight design pattern ****\n");

        ChessPiece blackPawn = new BlackPiece("Black Pawn","7", "a");
        ChessPiece whitePawn = new WhitePiece("White Pawn","2","a");
        ChessPiece blackQueen = new BlackQueen("Black Queen");
        ChessPiece whiteQueen = new WhiteQueen("White Queen");
        //exactly same Color object is used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());

        //Strategy
        System.out.println("\n**** Strategy design pattern ****\n");

        PriceCalculator priceCalculator = new PriceCalculator();
        //Normal price for user who is not signed up for the newsletter
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);
        //Wrong pricing strategy for a user who is signed up for the newsletter
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);
        //User is signed up for the newsletter
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);
        //Wrong pricing strategy for a user who is not signed up for the newsletter
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);

        //Singleton
        System.out.println("\n**** Singleton design pattern ****\n");

        GuessGame game = GuessGame.getInstance();
        game.play();
        int score = game.getScore();
        GuessGame anotherGameReference = GuessGame.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("And the score is correct!");
            }
        }
    }
}
