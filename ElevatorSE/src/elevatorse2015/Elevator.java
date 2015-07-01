package elevatorse2015;




public class Elevator {
     int current_pos ;
     
     ElevatorDoorContext ed;

     
     public Elevator(){
 		//display();
    	 current_pos=0;
    	 ed= new ElevatorDoorContext(new CloseDoor());
    	
 	}
	public int getCurrent_pos() {
		return current_pos;
	}

	public void setCurrent_pos(int current_pos) {
		this.current_pos = current_pos;
	} 
     
	public void Up(int current_pos){
		this.current_pos++;
	}
	
	public void Down(int current_pos){
		this.current_pos--;
	}
	
	//changes added.
	
}
