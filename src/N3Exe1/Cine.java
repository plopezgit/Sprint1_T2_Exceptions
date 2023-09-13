package N3Exe1;

public class Cine {
	private int theaterRowsNumber;
	private int theaterRowSeatsNumber;
	private SeatManager seatManager;

	public Cine() {
		seatManager = new SeatManager();
		askInitialDataOfTheater();

	}
	
	//Class method
	
	public int start () {
		int menuOption = 0;
		
		//
		
		return menuOption;
	}
	
	public 

	@Override
	public String toString() {
		return "Cine [theaterRowsNumber=" + theaterRowsNumber + ", theaterRowSeatsNumber=" + theaterRowSeatsNumber
				+ "]";
	}
	
}
