package elevatorse2015;

import java.util.Scanner;

public class Floor {

	public int floor_no;
    FloorButton fb;
     
    public Floor(){
		//display();
    	floor_no=0;
    	fb=new FloorButton();
	}

    public int whichfloor() {
    	
    	
    	Scanner sc=new Scanner(System.in);
		int floorch=0;
		
		//Setting user Floor No
		do{
		System.out.println("[Waiting]Enter Which Floor your on ?");
		floorch=sc.nextInt();	
		
		if(!(floorch>=0 && floorch<7))
			System.out.println("Invalid Floor No.");
		
		}while(!(floorch>=0 && floorch<7));
    	return floorch;
    }
    
    
	public int getFloor_no() {
		return floor_no;
	}

	public void setFloor_no(int floor_no) {
		this.floor_no = floor_no;
	}
	
}
