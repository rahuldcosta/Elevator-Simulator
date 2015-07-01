package elevatorse2015;

import java.util.Scanner;




public class Elevator {
     int current_pos ;
     int nooffloors;
     ElevatorDoorContext ed;

     
     public Elevator(int x){
 		//display();
    	 nooffloors=x;
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
		System.out.printf("||0(Grnd)");
		
		for (int j = 1; j < nooffloors; j++) {
			System.out.printf("  " + j);
		}
		System.out.printf("||\n");
		
		System.out.println("||===============================||");
	
	}
	
	//changes added.
	
}
