package proj1;

public class Garage {

	private boolean operating;    //If the door is operating properly
	private boolean empty;        //If the garage has space or not
	private int door;         //If the door is open or close; open = 0, close = 1
	private int accident;
	
	public Garage() {
		this.operating = true;
		this.empty = true;
		this.door = 1;
		this.accident = 0;
	}
	
	public void openDoor(){
		if ((this.door==1) && this.operating){
			this.door = 0;
			System.out.println("The garage door has been opened");
		}
		else{
			System.out.println("The garage door is either open or non-functioning");
		}
	}
	public void closeDoor(){
		if(this.door==0 && this.operating){
			this.door=1;
			System.out.println("The garage door has been closed");
		}
		else{
			System.out.println("The garage door is either closed or non-functioning");
		}
	}
	public void pullCarIn(){
		    //If the garage is empty and the door is operating properly
			if(this.empty && this.operating){
				//If the door is open, pull the car in
				if(this.door == 0){
					this.empty=false;
					System.out.println("The car has been pulled in");
				}
				//The door is not open, and you tried to pull the car in and hence broke the door
				else{
					this.operating=false;
					System.out.println("The door is broken because you tried to pull in with the door closed");
				}
			}
			//If the garage is not empty and the door is operating properly
			else{
				//If the door is open, there is an accident because the car is already there and you tried to pull in another car
				if(this.door == 0){
					this.operating=false;
					this.accident++;
				}
				//The garage is full and the door is closed
				else{
				System.out.println("The garage is either full or non-functioning");	
				}
			}
		}
	public void backCarOut(){
		//If the garage is not empty and the door is operating properly
		if(!this.empty && this.operating){
			if(this.door==1){
				this.operating=false;
				System.out.println("The garage door is broken because you tried to back out when the door was closed");
			}
			else{
				this.empty = true;
				System.out.println("The car has been backed out");
			}
		}
		else{
			System.out.println("The garage is either empty or non-functioning");
		}
	}
    public boolean findEmptySpace(){
    	return this.empty;
    }
    public void displayState(){
    	if((this.door==0) && (this.empty)){
    		System.out.println("The garage is empty");
    		System.out.println("The garage door is open");
    	}
    	else{
    		System.out.println("The garage is occupied");
    		System.out.println("The garage door is closed");
    	}
    	if(this.operating){
    		System.out.println("The garage door is working");
    	}
    	else{
    		System.out.println("The garage door is broken");
    		System.out.println("The garage met an accident"+this.accident);
    	}
    }
}

