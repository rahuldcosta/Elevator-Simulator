package elevatorse2015;

import java.util.Scanner;

public class FloorButton {

	public FloorButton(){
		display();
	}
	
	public int selectFloor(){
		Scanner in=new Scanner(System.in);
	    int floor=in.nextInt();
	    return floor;
	}
	
	public void display(){
		System.out.println("Select Floor you want to go");
		System.out.println("1	2	3");
		System.out.println("4	5	6");
	
	}
	
}
