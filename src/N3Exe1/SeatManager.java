package N3Exe1;

import java.util.ArrayList;

import N3Exe1.Exceptions.*;

public class SeatManager {
	
	ArrayList<Seat> seatList;

	public SeatManager() {
		
		seatList = new ArrayList<Seat>();

	}

	public ArrayList<Seat> getSeatList() {
	
		return seatList;
	}
	
	public ArrayList<Seat> addSeat (Seat seat) throws TakenSeatException {
		if (existSeat (seat.getRowNumber(), seat.getSeatNumber()) != 1) {
			throw new TakenSeatException ("...");
			
		} else {
			seatList.add(seat);
			
		}
		return seatList;
	}
	
	public ArrayList<Seat> deleteSeat (int rowNumber, int seatNumber) throws FreeSeatException {
		if (existSeat (rowNumber, seatNumber) == -1) {
			throw new FreeSeatException ("...");
			
		} else {
			seatList.remove(existSeat (rowNumber, seatNumber));
			
		}
		return seatList;
	}
	
	public int existSeat (int rowNumber, int seatNumber) { //Ref: https://refactorizando.com/encontrar-elemento-lista-java/
		int seatIndex = -1;
		int i = 0;

		while (seatIndex==-1 && seatList.size() != i) {
			if (seatList.get(i).getRowNumber() == (rowNumber) && seatList.get(i).getSeatNumber() == (seatNumber)) {
				seatIndex = i;
			}else {
				seatIndex = -1;
				i++;		
			}
		}
		return seatIndex;
	}

}
