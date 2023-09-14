package N3Exe1;

import java.util.ArrayList;
import java.util.Iterator;

import N3Exe1.Exceptions.FreeSeatException;
import N3Exe1.Exceptions.IncorrectClientNameException;
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

	// Class methods

	public void start() {
		int option = 0;
		do {
			switch (option = menu()) {
			case 1:
				System.out.println(showReservedSeatsOfTheater() + "\n");
				break;
			case 2:
				System.out.println(showReservedSeatsOfTheaterByClient()+ "\n");	
				break;
			case 3:
				System.out.println(reserveSeatOfTheaterByClient()+ "\n");
				break;
			case 4:
				System.out.println(deleteReserveSeatOfTheater()+ "\n");
				break;
			case 5:
				System.out.println(deleteReserveSeatOfTheaterByClient()+ "\n");
				break;
			case 6:
				System.out.println("Bye.\n");
				break;
			default:
				System.out.println("Option not available.\n");

			}
		} while (option != 6);
			
	}

	public int menu() {

		String mainMenu = "What do you want to do?\n" + "(1)Show reserved seats.\n"
				+ "(2)Show reserved setas by client.\n" + "(3)Reserve seat.\n" + "(4)Delete reserve.\n"
				+ "(5)Delete all reserves by client.\n" + "(6)Exit.\n";
	
		return Input.inputInt(mainMenu);
	}

	public ArrayList<Seat> showReservedSeatsOfTheater() {

		return seatManager.getSeatList();
	}

	public ArrayList<Seat> showReservedSeatsOfTheaterByClient() {
		String clientName = Input.inputString("Client name: ");
		ArrayList<Seat> tempReservedSeatsOfTheaterByClient = new ArrayList<Seat>();
		for (Seat seat : seatManager.getSeatList()) {
			if (seat.getClientName().equalsIgnoreCase(clientName)) {
				tempReservedSeatsOfTheaterByClient.add(seat);
			} 
		}
		
		return tempReservedSeatsOfTheaterByClient;
	}

	public ArrayList<Seat> reserveSeatOfTheaterByClient() {
		try {
			seatManager.addSeat(new Seat(introduceRowOfTheather(), introduceSeatOfRowOfTheather(), introduceClientOfTheather()));
		} catch (TakenSeatException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectRowException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectSeatException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectClientNameException e) {
			System.out.println(e.getMessage());
		}
		
		return seatManager.getSeatList();
	}

	public ArrayList<Seat> deleteReserveSeatOfTheater() {
		try {
			seatManager.deleteSeat(introduceRowOfTheather(), introduceSeatOfRowOfTheather());
		} catch (FreeSeatException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectRowException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectSeatException e) {
			System.out.println(e.getMessage());
		}
		
		return seatManager.getSeatList();
	}

	public ArrayList<Seat> deleteReserveSeatOfTheaterByClient() {
		try {
			String clientName = introduceClientOfTheather();
			Iterator<Seat> iterator = seatManager.getSeatList().iterator();
			Seat seat;
			while (iterator.hasNext()) {
				seat = iterator.next();
				if (seat.getClientName().equals(clientName)) {
					iterator.remove();
				} 
			}
		} catch (IncorrectClientNameException e) {
			System.out.println(e.getMessage());
		}
	
		return seatManager.getSeatList();
	}

	public String introduceClientOfTheather() throws IncorrectClientNameException {
		String validName;
		String clientName = Input.inputString("Client name: ");
		if (clientName.matches(".*[0-9].*")) {
			throw new IncorrectClientNameException ("The name must not contain numbers.\n");
		} else {
			validName = clientName;
		}
		
		return validName;
	}

	public void askInitialDataOfTheater() {
		theaterQuantityOfRows = Input.inputInt("Set the quantity of rows of the Cinema:");
		theaterQuantityOfSeatsByRow = Input.inputInt("Set the quantity of seats by row:");
	}

	public int introduceRowOfTheather() throws IncorrectRowException {
		int validRowNuber;
		int rowNumber = Input.inputInt("Row number: ");
		if (rowNumber >= 1 && rowNumber <= theaterQuantityOfRows) {
			validRowNuber = rowNumber; 
		} else {
			throw new IncorrectRowException ("Row does not exist.\n");

		}
		
		return validRowNuber;
	}

	public int introduceSeatOfRowOfTheather() throws IncorrectSeatException {
		int validSeatNumber;
		int seatNumber = Input.inputInt("Seat number: ");
		if (seatNumber >= 1 && seatNumber <= theaterQuantityOfSeatsByRow) {
			validSeatNumber = seatNumber; 
		} else {
			throw new IncorrectSeatException ("Seat does not exist.\n");
			
		}
		
		return validSeatNumber;
	}

}
