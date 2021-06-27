package state.gameMachine;

import java.util.Random;

public class CoinInsertedState implements State {

    @Override
    public void insertCoin(GameMachine gameMachine) {
        System.out.println("Coin has already been inserted");
    }

    @Override
    public void pullTrigger(GameMachine gameMachine) {
        System.out.println("Pull the trigger");
        Random rand = new Random();
        boolean win = rand.nextInt(5) == 0;
        if (win) {
            gameMachine.state = new WinLooseState();
        } else {
            gameMachine.state = new NoCoinState();
        }
    }

    @Override
    public void takeAward(GameMachine gameMachine) {
        System.out.println("Pull the trigger to start the game and take award");
    }

    @Override
    public void showCurrentState(GameMachine gameMachine) {
        System.out.println("Current state: " + gameMachine.state.toString());
    }
}
