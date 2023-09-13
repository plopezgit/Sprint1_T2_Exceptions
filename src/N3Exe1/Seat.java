package N3Exe1;

public class Seat {
	
	private int rowNumber;
	private int seatNumber;
	private Client client;
	
	public Seat(int rowNumber, int seatNumber, Client client) {
		this.rowNumber = rowNumber;
		this.seatNumber = seatNumber;
		this.client = client;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public Client getClient() {
		return client;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rowNumber;
		result = prime * result + seatNumber;
		return result;
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
		return "Row: " + rowNumber + ", Seat: " + seatNumber + ", Client: " + client;
	}
	
	
	
	
}
