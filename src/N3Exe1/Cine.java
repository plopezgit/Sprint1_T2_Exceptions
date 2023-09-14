package N3Exe1;

import java.util.ArrayList;
import java.util.Iterator;

import N3Exe1.Exceptions.IncorrectRowException;
import N3Exe1.Exceptions.IncorrectSeatException;
import N3Exe1.Exceptions.TakenSeatException;

public class Cine {
	private int theaterQuantityOfRows;
	private int theaterQuantityOfSeatsByRow;
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
		try {
			seatManager.addSeat(new Seat(introduceRowOfTheather(), introduceSeatOfRowOfTheather(), introduceClientOfTheather()));
		} catch (TakenSeatException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectRowException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectSeatException e) {
			System.out.println(e.getMessage());
		}

	}

	public void deleteReserveSeatOfTheater() {

	}

	public void deleteReserveSeatOfTheaterByClient() {

	}

	public String introduceClientOfTheather() {
		String clientName = Input.inputString("Client name: ");
		
		return clientName;
	}

	public void askInitialDataOfTheater() {
		theaterQuantityOfRows = Input.inputInt("Set the quantity of rows of the Cinema:");
		theaterQuantityOfSeatsByRow = Input.inputInt("Set the quantity of seats by row:");
	}

	public int introduceRowOfTheather() throws IncorrectRowException {
		int rowNumber = Input.inputInt("Row number: ");
		int ok = -1;
		if (rowNumber >= 1 && rowNumber <= theaterQuantityOfRows) {
			ok = rowNumber; 
		} else {
			throw new IncorrectRowException ("Row incorrect.\n");

		}
		
		return ok;
	}

	public int introduceSeatOfRowOfTheather() throws IncorrectSeatException {
		int seatNumber = Input.inputInt("Seat number: ");
		int ok = -1;
		if (seatNumber >= 1 && seatNumber <= theaterQuantityOfSeatsByRow) {
			ok = seatNumber; 
		} else {
			throw new IncorrectSeatException ("Seat incorrect.\n");
			
		}
		
		return ok;
	}

	@Override
	public String toString() {
		return "Cine [theaterNumberOfRows=" + theaterQuantityOfRows + ", theaterNumberOfSeatsbyRow="
				+ theaterQuantityOfSeatsByRow + "]";
	}

}
