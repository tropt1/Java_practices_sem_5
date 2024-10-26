package prac_6.bikeproject.src.bikeproject;

public class MountainBike extends Bike implements MountainParts {
	private String suspension, type;
	private int frameSize;

	public MountainBike() {
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}

	public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears,
						String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}

	@Override
	public String getSuspension() {
		return suspension;
	}

	@Override
	public void setSuspension(String newValue) {
		this.suspension = newValue;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String newValue) {
		this.type = newValue;
	}

	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("This mountain bike is a " + type + " bike and has a " + suspension + " suspension and a frame size of " + frameSize + " inches.");
	}
}
