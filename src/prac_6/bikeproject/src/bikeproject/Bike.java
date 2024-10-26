package prac_6.bikeproject.src.bikeproject;

public class Bike implements Manufacturer, BikeParts {
	private String handleBars, frame, tyres, seatType;
	private int NumGears;

	public Bike() {
		// Default constructor
	}

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		this.NumGears = numGears;
	}

	@Override
	public String getHandleBars() {
		return handleBars;
	}

	@Override
	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}

	@Override
	public String getFrame() {
		return frame;
	}

	@Override
	public void setFrame(String newValue) {
		this.frame = newValue;
	}

	@Override
	public String getTyres() {
		return tyres;
	}

	@Override
	public void setTyres(String newValue) {
		this.tyres = newValue;
	}

	@Override
	public String getSeatType() {
		return seatType;
	}

	@Override
	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}

	@Override
	public int getNumGears() {
		return NumGears;
	}

	@Override
	public void setNumGears(int newValue) {
		this.NumGears = newValue;
	}

	protected void printDescription() {
		System.out.println("\n" + manufacturer + "\n" +
				"This bike has " + handleBars + " handlebars on a " +
				frame + " frame with " + NumGears + " gears." +
				"\nIt has a " + seatType + " seat with " + tyres + " tyres.");
	}
}
	

