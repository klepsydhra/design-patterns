package state.gameMachine;

public class WinLooseState implements State {

    @Override
    public void insertCoin(GameMachine gameMachine) {
        System.out.println("The coin has already been inserted");
    }

    @Override
    public void pullTrigger(GameMachine gameMachine) {
        System.out.println("Take the award");
    }

    @Override
    public void takeAward(GameMachine gameMachine) {
        System.out.println("Award has been taken");
        gameMachine.state = new NoCoinState();
    }

    @Override
    public void showCurrentState(GameMachine gameMachine) {
        System.out.println("Current state: " + gameMachine.state.toString());
    }
}
