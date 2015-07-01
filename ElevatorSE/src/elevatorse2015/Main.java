package elevatorse2015;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int elevatorno=0;
		
		ElevatorSytem es= new ElevatorSytem();
		
		while (1==1) {
			Integer floorch = es.UserfloorSelection();
			elevatorno = es.simulateelevator(floorch, elevatorno);
		}

	}

}
