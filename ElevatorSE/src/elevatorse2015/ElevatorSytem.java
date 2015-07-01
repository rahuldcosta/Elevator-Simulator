package elevatorse2015;

import java.util.Scanner;

public class ElevatorSytem {

	
	
	public ElevatorSytem() {
		// TODO Auto-generated constructor stub
		System.out.println("The Elevator Program Started ,Initialized");
		
	}

	public int UserfloorSelection(){
		
		Floor f = new Floor();
		
		return f.whichfloor();
	}
	
	
	public int simulateelevator(Integer userflr,int elevatorno)
	{
		Elevator e = new Elevator();
				
		Floor f = new Floor();
		
		
		int ff=0;
		Boolean flag=true;
		String choice="n";
		e.setCurrent_pos(elevatorno);
		
		Scanner sc=new Scanner(System.in);
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
					e.ed.switchState();
					break; }
				
					
			}
			
			if(flag)
			{
				flag=false;
			}
			else{
				System.out.println("Do You Want to GetOff on this Floor ((_Y-Yes || N-No_))");
				choice=sc.next();
			}
			
			
			if(choice.equals("N")|| choice.equals("n"))
			{
				e.ed.switchState();
				f.fb.display();
				
				do{
					ff=f.fb.selectFloor();
					
					if(!(ff>=0 && ff<7))
						System.out.println("Invalid Floor No.");
					
					}while(!(ff>=0 && ff<7));
				
				
				switch(ff)
				{
				 
				case 0 :
					
					if(e.getCurrent_pos()==0)
						System.out.println("your  already on ground floor");
					else
					System.out.println("ground floor selected");
					
					
					userflr=ff;
					break;
	case 1 :
					
					
					System.out.println("your on 1st floor");
					userflr=ff;
					break;
	case 2 :
		
		
		System.out.println("your on 2nd floor");
		
		
		userflr=ff;
		break;
	case 3 :
		
		
		System.out.println("your on 3rd floor");
		
		userflr=ff;
		break;
	case 4 :
		
		
		System.out.println("your on 4th floor");
		userflr=ff;
		break;
	case 5 :
		
		
		System.out.println("your on 5th floor");
		userflr=ff;
		break;
	case 6 :
		
		
		System.out.println("your on 6th floor");
		userflr=ff;
		break;
		
		
				}
				
				//if(ff==0)
				//e.current_pos=ff;	
				//System.out.println(ff);
				//e.getCurrent_pos();
				
				
			}
			else if (choice.equals("Y")|| choice.equals("y"))
			{
				System.out.println("Thank You For Using the Elevator");
				e.ed.switchState();
				break;
			}
			
			
		}
		while(1==1);


		return e.getCurrent_pos();
	}

}
