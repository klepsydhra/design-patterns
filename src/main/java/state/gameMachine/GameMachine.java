package state.gameMachine;

public class GameMachine {

    State state;

    public GameMachine() {
        this.state = new NoCoinState();
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pullTrigger() {
        state.pullTrigger(this);
    }

    public void takeAward() {
        state.takeAward(this);
    }

    public void showCurrentState() {
        state.showCurrentState(this);
    }
}
