
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	public void testSumma() {
		int x = 1+3;
		assertEquals(4, x);
	}
	
	@Test
	public void testErotus() {
		int x = 1-3;
		assertEquals(2, x);
	}
}
