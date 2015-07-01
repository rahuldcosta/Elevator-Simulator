package elevatorse2015;


public abstract class State {
	protected String stateName;
	
	public abstract void switchState(ElevatorDoorContext context);
	
	public String getStateName()
	{
		return stateName;
	}
}