import java.util.*;
public class shoppingchart {

	private  List <Product> productList = new ArrayList<>();
		 double totalCartValue;

public void addProduct(Product product) {
	productList.add(product);
	}
	

	public   int  getProductCount() {
		// TODO Auto-generated method stub
	
		return productList.size();
	}
	
	public double getTotalCartValue() {
	
		if (productList.size() > 0) {
			for (Product product : productList) {
			totalCartValue = totalCartValue + product.getTotalPrice();
			}
		}
		return totalCartValue;
	}
}
//