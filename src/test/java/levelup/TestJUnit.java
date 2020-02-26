package levelup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {

	@Test
	public void testString() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}

	@Test
	public void testNum() {
		assertEquals(123, 124);
	}

}