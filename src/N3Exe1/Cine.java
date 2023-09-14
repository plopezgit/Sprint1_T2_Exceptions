package N3Exe1;

import java.util.ArrayList;
import java.util.Iterator;

public class Cine {
	private int theaterNumberOfRows;
	private int theaterNumberOfSeatsbyRow;
	private SeatManager seatManager;

	public Cine() {
		seatManager = new SeatManager();
		askInitialDataOfTheater();

	}

	// Class method

	public void start(int option) {

			switch (option) {
			case 1:
				System.out.println(showReservedSeatsOfTheater().toString());
				break;
			case 2:
				System.out.println(showReservedSeatsOfTheaterByClient(Input.inputStringLow("Client name:")));	
				break;
			case 3:
				reserveSeatOfTheaterByClient();
				break;
			case 4:
				deleteReserveSeatOfTheater();
				break;
			case 5:
				deleteReserveSeatOfTheaterByClient();
				break;
			case 6:
				System.out.println("Bye.\n");
				break;
			default:
				System.out.println("Option not available.\n");

			}
	}

	public int menu() {

		String mainMenu = "Ok. What do you want to do?\n" + "(1)Show reserved seats.\n"
				+ "(2)Show reserved setas by client.\n" + "(3)Reserve seat.\n" + "(4)Delete reserve.\n"
				+ "(5)Delete all reserves by client.\n" + "(6)Exit.\n";

		return Input.inputInt(mainMenu);
	}

	public ArrayList<Seat> showReservedSeatsOfTheater() {

		return seatManager.seatList;
	}

	public ArrayList<Seat> showReservedSeatsOfTheaterByClient(String clientName) {
		ArrayList<Seat> reservedSeatsOfTheaterByClient = new ArrayList<Seat>();
		Iterator<Seat> iterator = seatManager.seatList.iterator();
		while (iterator.hasNext()) {
			Seat seat = iterator.next();
			if (seat.getClientName().equals(clientName)) {
				reservedSeatsOfTheaterByClient.add(seat);
			} 
		}
		return reservedSeatsOfTheaterByClient;
	}

	public void reserveSeatOfTheaterByClient() {

	}

	public void deleteReserveSeatOfTheater() {

	}

	public void deleteReserveSeatOfTheaterByClient() {

	}

	public void createClientOfTheather() {

	}

	public void askInitialDataOfTheater() {
		theaterNumberOfRows = Input.inputInt("Introduce the number of rows of the Cinema:");
		theaterNumberOfSeatsbyRow = Input.inputInt("Introduce the number of seats by row:");
	}

	public void createRowOfTheather(int rowNumber) {

	}

	public void createSeatOfRowOfTheather(int seatNumber) {

	}

	@Override
	public String toString() {
		return "Cine [theaterNumberOfRows=" + theaterNumberOfRows + ", theaterNumberOfSeatsbyRow="
				+ theaterNumberOfSeatsbyRow + "]";
	}

}
