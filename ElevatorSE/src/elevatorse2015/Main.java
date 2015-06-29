package elevatorse2015;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ff=0;
		String choice="n";
		Integer userflr=0;
		System.out.println("The Elevator Program Started ,Initialized");
		
		Elevator e = new Elevator();
		
		
		Floor f = new Floor();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Floor your on ?");
		userflr=sc.nextInt();
	    
		do{
			
			for(int i=0;i<7;i++)
			{
				
				if(e.getCurrent_pos()<userflr)
					{ e.Up(e.getCurrent_pos());
					  System.out.println("Going Up...."+"Current Floor:-"+e.getCurrent_pos());
					}
				else if(e.getCurrent_pos()>userflr)
					{ e.Down(e.getCurrent_pos());
					  System.out.println("Going Down...."+"Current Floor:-"+e.getCurrent_pos());
					}
					
				else if(e.getCurrent_pos()==userflr)
				{	
					
					System.out.println("Elevator has Reached "+e.getCurrent_pos()+" Floor");
					e.ed.opendoor();
					break; }
				
					
			}
			
			System.out.println("Do You Want to GetOff on this Floor ((_Y-Yes || N-No_))");
			choice=sc.next();
			
			if(choice.equals("N")|| choice.equals("n"))
			{
				e.ed.closedoor();
				f.fb.display();
				ff=f.fb.selectFloor();
				
				switch(ff)
				{
				 
				case 0 :
					
					if(e.getCurrent_pos()==0)
						System.out.println("your  already on ground floor");
					else
					System.out.println("ground floor selected");
					
					
					
					break;
	case 1 :
					
					
					System.out.println("your on 1st floor");
					
					break;
	case 2 :
		
		
		System.out.println("your on 2nd floor");
		
		
		
		break;
	case 3 :
		
		
		System.out.println("your on 3rd floor");
		
		
		break;
	case 4 :
		
		
		System.out.println("your on 4th floor");
		
		break;
	case 5 :
		
		
		System.out.println("your on 5th floor");
		
		break;
	case 6 :
		
		
		System.out.println("your on 6th floor");
		
		break;
		
		default :  System.out.println("Invalid Floor Choice,Retry");
		
				}
				userflr=ff;
				//if(ff==0)
				//e.current_pos=ff;	
				//System.out.println(ff);
				//e.getCurrent_pos();
				
				
			}
			else if (choice.equals("Y")|| choice.equals("y"))
			{
				System.out.println("Elevator Program Ended");
				e.ed.closedoor();
				break;
			}
			
			
		}
		while(1==1);
		
		
		//comment.

	}

}
