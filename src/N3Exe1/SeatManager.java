package N3Exe1;

import java.util.ArrayList;

import N3Exe1.Exceptions.*;

public class SeatManager {
	
	private ArrayList<Seat> seatList;

	public SeatManager() {
		seatList = new ArrayList<Seat>();

	}
	
	//Class methods

	public ArrayList<Seat> getSeatList() {
	
		return seatList;
	}
	
	public ArrayList<Seat> addSeat (Seat seat) throws TakenSeatException {
		if (existSeat (seat.getRowNumber(), seat.getSeatNumber()) != -1) {
			throw new TakenSeatException ("The seat is already reserved.\n");
		} else {
			seatList.add(seat);	
		}
		
		return seatList;
	}
	
	public ArrayList<Seat> deleteSeat (int rowNumber, int seatNumber) throws FreeSeatException {
		if (existSeat (rowNumber, seatNumber) == -1) {
			throw new FreeSeatException ("The seat is free.\n");
		} else {
			seatList.remove(existSeat (rowNumber, seatNumber));
		}
		
		return seatList;
	}
	
	private int existSeat (int rowNumber, int seatNumber) { //After Task1 Feedback
		Seat seat = new Seat(rowNumber, seatNumber);
		int seatIndex = seatList.indexOf(seat);
		
		return seatIndex;
	}

}
