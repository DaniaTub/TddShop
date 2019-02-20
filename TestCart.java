

import java.util.*;

public class TestCart {
	private  List <TestProduct> productList = new ArrayList<>();
	 double totalCartValue;

public void addProduct(TestProduct product) {
productList.add(product);
}
public   int  getProductCount() {
	// TODO Auto-generated method stub

	return productList.size();
}

public double getTotalCartValue() {

	if (productList.size() > 0) {
		for (TestProduct product : productList) {
		totalCartValue = totalCartValue + product.getTotalPrice();
		}
	}
	return totalCartValue;
}
}
