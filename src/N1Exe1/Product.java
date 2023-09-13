package N1Exe1;

public class Product {
	
	private String produtcName;
	private int productPrice;
	
	public Product () {
	
	}

	public Product(String produtcName, int productPrice) {
		this.produtcName = produtcName;
		this.productPrice = productPrice;
	}

	public String getProdutcName() {
		return produtcName;
	}

	public void setProdutcName(String produtcName) {
		this.produtcName = produtcName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [produtcName=" + produtcName + ", productPrice=" + productPrice + "]";
	}

}

