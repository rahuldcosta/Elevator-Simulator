package elevatorse2015;




public class ElevatorDoorContext {
  
private State state;
private static OpenDoor od= new OpenDoor();
private static CloseDoor cd= new CloseDoor();


public static OpenDoor getopenins(){
	
	if(od!=null)
	return od;
	else 
		return  new OpenDoor();
	
	
}

public static CloseDoor getcloseins(){
	
	if(cd!=null)
	return cd;
	else 
		return  new CloseDoor();
	
	
}


	
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
