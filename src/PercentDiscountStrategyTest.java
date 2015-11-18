import static org.junit.Assert.*;

import org.junit.Test;

public class PercentDiscountStrategyTest {

	Order order = new Order("Test", 300);
	
	PercentDiscountStrategy pctdiscount = new PercentDiscountStrategy(35);
	float calDiscount = pctdiscount.applyDiscount(order);
	float expDiscount = 195;
	
	@Test
	public void test() {
		
		assertTrue(calDiscount == expDiscount);
	}

}
