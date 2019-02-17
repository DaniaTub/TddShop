 
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@SuppressWarnings("unused")
public class shoppingChartTest {

	@Test
	public void testOne() {
	
		shoppingchart cart = new shoppingchart();
		Assert.assertEquals(0, cart.getProductCount());
	} 

	@Test
	
	public void testTwo()throws Exception {
		shoppingchart cart = new shoppingchart();
		Product product = new Product("javaprogramming", 1, 127.0);
		cart.addProduct(product);
		assertEquals(1, cart.getProductCount());
		assertEquals(127.0, cart.getTotalCartValue(),0.0);

	}
	

	@Test
	public void testThree()throws Exception{
		shoppingchart cart = new shoppingchart();
		Product javabook = new Product("javaProgramming", 1, 127.0);
		Product webbook = new Product("WebProgramming", 1, 100.0);
		cart.addProduct(javabook);
		cart.addProduct(webbook);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(227.0, cart.getTotalCartValue(),0.0);
	}
	
}
//