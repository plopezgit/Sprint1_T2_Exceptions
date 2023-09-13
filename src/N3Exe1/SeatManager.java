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
	
	public ArrayList<Seat> addSeat () throws TakenSeatException {
	
		return seatList;
	}
	
	public ArrayList<Seat> deleteSeat () throws FreeSeatException {
		
		return seatList;
	}
	
	public int existSeat () { //Ref: https://refactorizando.com/encontrar-elemento-lista-java/
		int seatIndex = 0;
		return seatIndex;
	}

}
