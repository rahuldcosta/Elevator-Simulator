package elevatorse2015;

import java.util.Scanner;




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
	
	
	public int selectFloor(){
		Scanner in=new Scanner(System.in);
	    int floor=in.nextInt();
	    return floor;
	}
	
	
	public void displayElevatorPanel(){
		System.out.println("Select Floor No to go to");
		System.out.println("||===============================||");
		System.out.println("||0(Grnd)	1  2  3  4  5  6 ||");
		System.out.println("||===============================||");
	
	}
	
	//changes added.
	
}
