package elevatorse2015;



public class OpenDoor extends State {

	public OpenDoor() {
		// TODO Auto-generated constructor stub
		stateName = "Openning";
	}

	@Override
	public void switchState(ElevatorDoorContext context) {
		CloseDoor o = new CloseDoor();
		context.setState(o);
		System.out.println("Door is  " + o.getStateName()+" ..........");
		// TODO Auto-generated method stub

	}

}
