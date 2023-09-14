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
		
		do {
			switch (menu()) {
			case 1:
				showReservedSeatsOfTheater ();
				break;
			case 2:
				showReservedSeatsOfTheaterByClient ();
				break;
			case 3:
				reserveSeatOfTheaterByClient ();
				break;
			case 4:
				deleteReserveSeatOfTheater ();
				break;
			case 5:
				deleteReserveSeatOfTheaterByClient ();
				break;
			case 6:
				System.out.println("Bye.\n");
				break;
			default:
				System.out.println("Option not available.\n");
				
			}
		} while (menu() !=6);
	}
	
	public int menu () {
		
		String mainMenu = "Cinema. What do you want to do?\n"
				+ "(1)Show reserved seats.\n"
				+ "(2)Show reserved setas by client.\n"
				+ "(3)Reserve seat.\n"
				+ "(4)Delete reserve.\n"
				+ "(5)Delete all reserves by client.\n"
				+ "(6)Exit.\n";
		
		return Input.inputInt(mainMenu);
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
