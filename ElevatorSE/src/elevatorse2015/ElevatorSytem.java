package elevatorse2015;

import java.util.Scanner;

public class ElevatorSytem {

	private Floor f = new Floor();
	private Elevator e ;
	
	
	public ElevatorSytem(int ct) {
		// TODO Auto-generated constructor stub
		e = new Elevator(ct);
		System.out.println("The Elevator Program Started ,Initialized");
		
	}

	public int UserfloorSelection(){

		return f.fb.whichfloor(e.nooffloors);
	}
	
	
	public int simulateelevator(Integer userflr,int elevatorno,int destfloor)
	{

		int ff=0;
		Boolean flag=true;
		String choice="n";
		e.setCurrent_pos(elevatorno);
		
		Scanner sc=new Scanner(System.in);
do{
			
			for(int i=0;i<e.nooffloors;i++)
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
			//	System.out.println("Do You Want to GetOff on this Floor ((_Y-Yes || N-No_))");
				//choice=sc.next();
				
				choice="y";
			}
			
			
			if(choice.equals("N")|| choice.equals("n"))
			{
				e.ed.switchState();
				//e.displayElevatorPanel();
				
				do{
					
					//ff=e.selectDestFloor();
					ff=destfloor;
					
					if(!(ff>=0 && ff<e.nooffloors))
						System.out.println("Invalid Floor No.");
					
					}while(!(ff>=0 && ff<e.nooffloors));
				
				userflr=this.floormsg(ff);
				
				
				
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
	

	public int floormsg(int ff){
		
		
		
		for (int i = 0; i < e.nooffloors; i++) {
			
			if(i==ff)
			{	if (e.getCurrent_pos() == ff)
				System.out.println("your  already on floor "+i);
			else
				System.out.println(" floor no "+i+" is selected");
			return ff;
			}
		}
		return -99;
	}
		
		



		
		
	
	
	

}
