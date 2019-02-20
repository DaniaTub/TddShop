import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class cartTest {
	@Test
	public void testOne() {
	
		TestCart cart = new TestCart();
		Assert.assertEquals(0, cart.getProductCount());
	} 

	@Test
	
	public void testTwo()throws Exception {
		TestCart cart = new TestCart();
		TestProduct product = new TestProduct("javaprogramming", 1, 127.0);
		cart.addProduct(product);
		assertEquals(1, cart.getProductCount());
		assertEquals(127.0, cart.getTotalCartValue(),0.0);

	}
	

	@Test
	public void testThree()throws Exception{
		TestCart cart = new TestCart();
		TestProduct javabook = new TestProduct("javaProgramming", 1, 127.0);
		TestProduct webbook = new TestProduct("WebProgramming", 1, 100.0);
		cart.addProduct(javabook);
		cart.addProduct(webbook);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(227.0, cart.getTotalCartValue(),0.0);
	}
}
