package N1Exe1;

import java.util.ArrayList;

import N1Exe1.Exceptions.EmptySaleListException;

public class Sale {
	
	private ArrayList<Product> productBuyedList;
	private int totalSalesAmount;

	public Sale () {
		productBuyedList = new ArrayList<Product>();
		this.totalSalesAmount = 0;
	}

	public ArrayList<Product> getProductBuyedList() {
		return productBuyedList;
	}

	public void setProductBuyedList(ArrayList<Product> productBuyedList) {
		this.productBuyedList = productBuyedList;
	}

	public int getTotalSalesAmount() {
		return totalSalesAmount;
	}

	public void setTotalSalesAmount(int totalSalesAmount) {
		this.totalSalesAmount = totalSalesAmount;
	}
	
	//Class methods
	
	public int calculateTotalSalesAmount () throws EmptySaleListException {
		
		if (productBuyedList.isEmpty()) {
			throw new EmptySaleListException ("To sale, a product must be added first");
		} else {
			for (int i= 0; i < productBuyedList.size(); i++) {
				totalSalesAmount += productBuyedList.get(i).getProductPrice();
			}
		}
			
		return totalSalesAmount;
	}

	@Override
	public String toString() {
		return "Sale [productBuyedList=" + productBuyedList + ", totalSalesAmount=" + totalSalesAmount + "]";
	}

}
