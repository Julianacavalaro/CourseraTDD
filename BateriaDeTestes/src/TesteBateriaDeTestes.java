import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteBateriaDeTestes {
	 
	@Test
	public void whenSeniorThenDiscountZero() {
		cliente = new Customer(true, false, false);
		assertEquals(0, cliente.calculateDiscount());
	}
	
	@Test
	public void whenNotSeniorAndSubsidizedThenDiscount250() {
		cliente = new Customer(false, true, false);
		assertEquals(250, cliente.calculateDiscount());
	}
	
	@Test
	public void whenNotSeniorAndNotSubsidizedAndPartTimeThenDiscount250(){
		cliente = new Customer(false, false, true);
		assertEquals(250, cliente.calculateDiscount());

	}

	@Test
	public void whenNotSeniorAndNotSubsidizedAndNotPartTimeThenDiscount500(){
		cliente = new Customer(false, false, false);
		assertEquals(500, cliente.calculateDiscount());

	}
	Customer cliente ;

}
