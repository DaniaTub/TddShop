
public class TestProduct {
	private String productName;
	private   int quantity;
	private  double totalPrice;
 
	
 
	public TestProduct(String productName2, int quantity2, double totalPrice2) {
		// TODO Auto-generated constructor stub
		this.productName = productName2;
		this.quantity = quantity2;
		this.totalPrice = totalPrice2;
	}
	

	public String getProductName() {
		return productName;
	}
 
	public void setProductName(String productName) {
		this.productName = productName;
	}
 
	public  int getQuantity() {
		return quantity;
	}
 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return totalPrice;
	}

	
	
}
