package elevatorse2015;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Puller
		//Design Patterns
		//Design Pattern :- Classes Participating in The Design Pattern
//		1.State:- ElevatorDoorContext,State,OpenDoor,CLoseDoor
//		2.Composite :- Floor,FloorBttonPanel
//		3.Facade:- ElevatorSystem,Elevator,Floor
	  //4.Singleton:- OpenDoor,CloseDoor,ElevatorDoorContext
		
		
		
		
		int elevatorno=0;
		int floors=6;
		
		
		ElevatorSytem es= new ElevatorSytem(floors);
		
		
		
		//format  ==>es.simulateelevator(floorch, elevatorno,destno);
		
		//Test Case 1
		
		System.out.println("format==> Src Floor , Elevator Pos , Dest Floor");
		System.out.println(".........................................");
		System.out.println("Test Case 1  => 3   ,  0   ,  0");
		System.out.println(".........................................");
		es.simulateelevator(3, 0,0);
		
		System.out.println(".........................................");
		System.out.println("Test Case 2  => 3   ,  top floor   ,  0");
		System.out.println(".........................................");
		//Test Case 2
		es.simulateelevator(3, floors,0);

		
		System.out.println(".........................................");
		System.out.println("Test Case 3 => 5   ,  top floor   ,  2");
		System.out.println(".........................................");
		//Test Case 3
		floors=5;
		es.simulateelevator(5, floors,2);
		System.out.println(".........................................");
		System.out.println("Test Case 4 => 0   ,  5   ,  0");
		System.out.println(".........................................");
		//Test Case 4
		es.simulateelevator(0, 5,0);
		

		
		
		
		
		
//		while (1==1) {
//		
//		
//		Integer floorch = es.UserfloorSelection();
//		
//		
//		elevatorno = es.simulateelevator(floorch, elevatorno);
//	}
	
	
	}

}
