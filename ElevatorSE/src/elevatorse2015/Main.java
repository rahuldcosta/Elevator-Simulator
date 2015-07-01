package elevatorse2015;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ElevatorSytem es= new ElevatorSytem();
		Integer floorch=es.Userfloor();
		
		es.simulateelevator(floorch);

	}

}
