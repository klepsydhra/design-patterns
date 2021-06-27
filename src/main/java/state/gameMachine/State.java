package state.gameMachine;

public interface State {

    void insertCoin(GameMachine gameMachine);
    void pullTrigger(GameMachine gameMachine);
    void takeAward(GameMachine gameMachine);
    void showCurrentState(GameMachine gameMachine);
}
