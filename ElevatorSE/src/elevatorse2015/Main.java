package elevatorse2015;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ff;
		System.out.println("The Elevator Program");
		
		Elevator e = new Elevator();
		
		e.setCurrent_pos(0);
		
		e.ed.closedoor();
		
		Floor f = new Floor();
		
		f.setFloor_no(0);
		
		
		f.fb.display();
		ff=f.fb.selectFloor();
		e.getCurrent_pos();
		
		//comment.

	}

}
