
public class TestDriveObject {
	
	private int speed;
	private boolean engine;
	private boolean brake;
	private int fuelTank;
	
	
	
	TestDriveObject(){
		speed=0;
		engine=false;
		brake=true;
		fuelTank=100;
	}//CarObject
	
	public int determineSpeed (int speedChange) {
		
		if(speedChange>0) {
			if(speed+speedChange>=200) {
				speed=200;
			}//if
			else {
				speed+=speedChange;
			}//else
		}//if
		else {
			if(speed+speedChange<0) {
				speed=0;
			}//if
			else {
				speed+=speedChange;
			}//else
		}//else
		return speed;
	}//determineSpeed
	
	public boolean engineStatus (String onOffEngine ) {
		
		if(onOffEngine.equalsIgnoreCase("On")) {
			engine=true;
			return engine;
		}//if
		else if (onOffEngine.equalsIgnoreCase("Off")) {
			engine=false;
			return engine;
		}//else if
		else {
			engine=false;
			return engine;
		}//else
	}//engineStatus
	
	public boolean brakeStatus(boolean brakeInput) {
		if(brakeInput==true) {
			brake=true;
			return brake;
		}//if
		else {
			brake=false;
			return brake;
		}//else
	}//brakeStatus
	
	public void steering (boolean steerInput) {
		if(steerInput==true) {
			System.out.println("You have turned right");
		}//if
		else {
			System.out.println("You have turned left");
		}//else
	}//steering
	
	public int fuelTank () {
		fuelTank-=10;
		return fuelTank;
	}
	
	public String toString() {
		String desc = "Fuel Level"+ fuelTank +" brake status "+ brake + "engine status " + engine + " Speed " + speed;
		return desc;
	}
	
}//CarObject
