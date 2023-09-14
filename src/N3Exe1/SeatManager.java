package N3Exe1;

import java.util.ArrayList;

import N3Exe1.Exceptions.*;

public class SeatManager {
	
	ArrayList<Seat> seatList;

	public SeatManager() {
		
		seatList = new ArrayList<Seat>();
		seatList.add(new Seat(1,2, "client1"));
		seatList.add(new Seat(1,3, "client1"));
		seatList.add(new Seat(3,5, "client2"));
		seatList.add(new Seat(2,5, "client1"));

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
