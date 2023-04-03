
public class Avion {
	private String planeID;
	private int totalEnginePower; 

	public Avion(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}

	public String getPlaneID() {
		return planeID;
	}
	
	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	public void takeOff() {
		System.out.println(getPlaneID() +"\n - Initiating takeoff procedure\n - Starting engines\n - Accelerating down the runway\n - taking off\n - Retracting gear\n - Takeoff complete.");
		System.out.println();
	}
	
	public void land() {
		System.out.println(getPlaneID()+ "\n - Initiating landing procedure\n - Enabling airbrakes\n - Lowering gear\n - Contacting runwat\n - Decelerating\n - Stopping engines\n - Landing complete.");
		System.out.println();
	}
	
	public void fly() {
		System.out.println(getPlaneID() +" -Flying.");
		System.out.println();
	}
	
}

class ALupta extends Avion{

	public ALupta(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	} 
	
	public void launchMissile() {
		System.out.println(getPlaneID()+ "\n - Initiating missile laung procedure\n - Acquiring target\n - Launching missile\n - Breaking away\n - Missile launch complete.");
		System.out.println();
	}
}

class ACalatori extends Avion {
	private int maxPassengers;

	public ACalatori(int maxPassengers, String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
}

class Boeing extends ACalatori{

	public Boeing(int maxPassengers, String planeID, int totalEnginePower) {
		super(maxPassengers, planeID, totalEnginePower);
	}
	
}

class Concorde extends ACalatori{

	public Concorde(int maxPassengers, String planeID, int totalEnginePower) {
		super(maxPassengers, planeID, totalEnginePower);
	}
	
	public void goSuperSonic() {
		System.out.println(super.getPlaneID() + " - Supersonic mode activated");
		System.out.println();
	}
	
	public void goSubSonic() {
		System.out.println(super.getPlaneID()+ " - Supersonic mode deactivated");
		System.out.println();
	}
}

class Mig extends ALupta{

	public Mig(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void highSpeedGeometry() {
		System.out.println(getPlaneID() + " - High speed geometry selected");
		System.out.println();
	}
	
	public void normalGeometry() {
		System.out.println(getPlaneID() + " - Normal geometry selected.");	
		System.out.println();
	}
}

class TomCat extends ALupta{

	public TomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void refuel() {
		System.out.println(getPlaneID() + "Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete.");
	}
}