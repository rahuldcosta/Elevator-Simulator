package elevatorse2015;

import java.util.Scanner;

public class Floor {

	public int floor_no;
    FloorButtonPanel fb;
     
    public Floor(){
		//display();
    	floor_no=0;
    	fb=new FloorButtonPanel();
	}

    
    
    
	public int getFloor_no() {
		return floor_no;
	}

	public void setFloor_no(int floor_no) {
		this.floor_no = floor_no;
	}
	
}
