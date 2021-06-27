package state.gameMachine;

public class NoCoinState implements State {

    @Override
    public void insertCoin(GameMachine gameMachine) {
        System.out.println("Insert coin");
        gameMachine.state = new CoinInsertedState();
    }

    @Override
    public void pullTrigger(GameMachine gameMachine) {
        System.out.println("Insert the coin to start the game");
    }

    @Override
    public void takeAward(GameMachine gameMachine) {
        System.out.println("Insert the coin to start the game and take award");
    }

    @Override
    public void showCurrentState(GameMachine gameMachine) {
        System.out.println("Current state: " + gameMachine.state.toString());
    }
}
