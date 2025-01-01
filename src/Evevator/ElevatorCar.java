package Evevator;

public class ElevatorCar {
    int id;
    ElevatorState elevatorState;
    ElevatorDisplay elevatorDisplay;
    InternalButton internalButton;
    int currentFloor;
    Direction direction;
    ElevatorDoor elevatorDoor;

    public ElevatorCar() {
        elevatorDisplay = new ElevatorDisplay();
        elevatorDoor = new ElevatorDoor();
        elevatorState = ElevatorState.idle;
        currentFloor = 0;
        direction = Direction.up;
        internalButton = new InternalButton();
    }
    public void showDisplay() {
        elevatorDisplay.showDisplay();
    }

    public void pressButton() {

    }
    public void setDisplay(){
        elevatorDisplay.setDisplay(currentFloor, direction);
    }
    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.up) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.down) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }
}
