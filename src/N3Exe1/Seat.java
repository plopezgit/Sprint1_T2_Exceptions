package N3Exe1;

public class Seat {
	
	private int rowNumber;
	private int seatNumber;
	private String clientName;
	
	public Seat(int rowNumber, int seatNumber, String clientName) {
		this.rowNumber = rowNumber;
		this.seatNumber = seatNumber;
		this.clientName = clientName;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public String getClientName() {
		return clientName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		if (rowNumber != other.rowNumber)
			return false;
		if (seatNumber != other.seatNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Row: " + rowNumber + ", Seat: " + seatNumber + ", Client: " + clientName;
	}
	
}
