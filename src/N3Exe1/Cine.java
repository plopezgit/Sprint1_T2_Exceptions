package N3Exe1;

public class Cine {
	private int theaterNumberOfRows;
	private int theaterNumberOfSeatsbyRow;
	private SeatManager seatManager;

	public Cine() {
		seatManager = new SeatManager();
		askInitialDataOfTheater();

	}
	
	//Class method

	public void start () {		
		menu();
	
	}
	
	public int menu () {
		
		return 0;
	}
	
	
	public void showReservedSeatsOfTheater () {
		
	}
	
	public void showReservedSeatsOfTheaterByClient () {
		
	}
	
	public void reserveSeatOfTheaterByClient () {
		
	}
	
	public void deleteReserveSeatOfTheater () {
		
	}
	
	public void deleteReserveSeatOfTheaterByClient () {
		
	}
	
	public void createClientOfTheather () {
		
	}
	
	public void askInitialDataOfTheater () {
		
	}
	
	public void createRowOfTheather (int rowNumber) {
		
	}
	
	public void createSeatOfRowOfTheather (int seatNumber) {
		
	}
	

	@Override
	public String toString() {
		return "Cine [theaterNumberOfRows=" + theaterNumberOfRows + ", theaterNumberOfSeatsbyRow="
				+ theaterNumberOfSeatsbyRow + "]";
	}
	
	

	
}
