import adapter.BookConnector;
import adapter.User;
import adapter.library.APIAdapter;
import adapter.library.LibraryApiv2;
import adapter.library.LibraryApiv2Impl;
import builder.flight.FlightLeg;
import chainOfResponsibility.MotherRequest;
import chainOfResponsibility.Shelf;
import chainOfResponsibility.child.Ania;
import chainOfResponsibility.child.Antek;
import chainOfResponsibility.child.Child;
import chainOfResponsibility.child.Tomek;
import command.MusicPlayer;
import command.MusicPlayerRemote;
import command.musicPlayerCommand.PlayFirstTrackCommand;
import command.musicPlayerCommand.PlayNextTrackCommand;
import command.musicPlayerCommand.PlayRandomTrackCommand;
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
import templateMethod.MyDay;
import templateMethod.TypeOfTransport;
import templateMethod.WeekDay;

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

        //Command
        System.out.println("\n**** Command design pattern ****\n");

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();

        //Chain of Responsibility
        System.out.println("\n**** Chain of Responsibility design pattern ****\n");

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);

        //Adapter
        System.out.println("\n**** Adapter design pattern ****\n");
        runAdapterExample();

        //Template Method
        System.out.println("\n**** Template Method design pattern ****\n");
        runTemplateMethodExample();

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

    private static void runAdapterExample() {
        User user = new User("Jakub","Kowalski","32131212");
        LibraryApiv2 libraryAPIv2 = new LibraryApiv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user, apiAdapter);
        connector.checkAvailability("The Godfather");
    }

    private static void runTemplateMethodExample() {
        WeekDay dayBike = new MyDay();
        dayBike.everyDayIsExactlyTheSame(TypeOfTransport.BIKE);

        WeekDay dayCar = new MyDay();
        dayCar.everyDayIsExactlyTheSame(TypeOfTransport.CAR);
    }
}
