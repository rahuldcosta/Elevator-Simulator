package elevatorse2015;

public class CloseDoor extends State {

	public CloseDoor() {
		// TODO Auto-generated constructor stub
		stateName = "Closing";
	}

	@Override
	public void switchState(ElevatorDoorContext context) {
		// TODO Auto-generated method stub
		//OpenDoor o = new OpenDoor();
		context.setState(context.getopenins());
		System.out.println("Door is  " + context.getopenins().getStateName()+" ..........");
	}

}
