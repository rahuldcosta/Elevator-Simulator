package elevatorse2015;

import java.util.Scanner;

public class ElevatorSytem {

	Elevator e = new Elevator();
	
	
	Floor f = new Floor();
	
		
		
		
	
	public ElevatorSytem() {
		// TODO Auto-generated constructor stub
		
		
		
		
		System.out.println("The Elevator Program Started ,Initialized");
		
	}

	public int Userfloor(){
		Scanner sc=new Scanner(System.in);
		int floorch=0;
		
		//Setting user Floor No
		do{
		System.out.println("Enter Which Floor your on ?");
		floorch=sc.nextInt();	
		
		if(!(floorch>=0 && floorch<7))
			System.out.println("Invalid Floor No.");
		
		}while(!(floorch>=0 && floorch<7));
		
		return floorch;
	}
	
	
	public void simulateelevator(Integer userflr)
	{
		int ff=0;
		Boolean flag=true;
		String choice="n";
		
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
					e.ed.opendoor();
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
				e.ed.closedoor();
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
				System.out.println("Elevator Program Ended");
				e.ed.closedoor();
				break;
			}
			
			
		}
		while(1==1);
	}

}
