import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestCalculator {

	@Test
	void testAdd() {
		Calculator c1 = new Calculator();
		c1.setValue(4,3);
		c1.add();
		assertEquals(7, c1.showResult());
		c1.setValue(5,3);
		c1.add();
		assertEquals(8, c1.showResult());
	}

	@Test
	void testMultiplay() {
		Calculator c1 = new Calculator();
		c1.setValue(4,3);
		c1.multiply();
		assertEquals(7, c1.showResult());
		c1.multiply();
		c1.add();
		assertEquals(25, c1.showResult());
	}
	
}



