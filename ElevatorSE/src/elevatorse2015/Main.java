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
		
		
		Floor f = new Floor();
		
	
		
		
		f.fb.display();
		ff=f.fb.selectFloor();
		System.out.println(ff);
		e.getCurrent_pos();
		
		//comment.

	}

}
