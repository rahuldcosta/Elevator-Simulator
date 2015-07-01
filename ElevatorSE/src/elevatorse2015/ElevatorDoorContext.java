package elevatorse2015;




public class ElevatorDoorContext {
  
private State state;
	
	public ElevatorDoorContext(State s)
	{
		state = s;
	}
	
	public State getState()
	{
		return state;
	}
	
	public void setState(State s)
	{
		state = s;
	}
	
	public void switchState()
	{
		state.switchState(this);
	}
}
