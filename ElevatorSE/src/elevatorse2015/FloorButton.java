package elevatorse2015;

import java.util.Scanner;

public class FloorButton {

	public FloorButton(){
		//display();
	}
	
	public int selectFloor(){
		Scanner in=new Scanner(System.in);
	    int floor=in.nextInt();
	    return floor;
	}
	
	public void display(){
		System.out.println("Select Floor No to go to");
		System.out.println("||===============================||");
		System.out.println("||0(Grnd)	1  2  3  4  5  6 ||");
		System.out.println("||===============================||");
	
	}
	
}
