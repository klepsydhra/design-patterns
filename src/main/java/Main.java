import facade.bank.AtmMachineFacade;
import singleton.game.GuessGame;

public class Main {

    public static void main(String[] args) {

        //Singleton
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

        //Facade
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
