import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runners.JUnit4;

public class calcTestTestTest {

	@Test
	public void testAdd() {		
	 assertEquals("error in add()",  3, Model.addTwoNumbers(1, 2), 1e-6);
    assertEquals("error in add()", -3, Model.addTwoNumbers(-1, -2), 1e-6);
    assertEquals("error in add()",  9, Model.addTwoNumbers(9, 0), 1e-6);
}
	@Test
	public void testSub() {
		 assertEquals("error in add()",  0, Model.stractTwoNumbers(2, 2), 1e-6);
		    assertEquals("error in add()", -1, Model.stractTwoNumbers(-2, -1), 1e-6);
		    assertEquals("error in add()",  1, Model.stractTwoNumbers(2, 1), 1e-6);
		
	}
	
	@Test
	public void testMul() {
		 assertEquals("error in add()",  4, Model.multiTwoNumbers(2, 2), 1e-6);
		 assertEquals("error in add()",  4, Model.multiTwoNumbers(-2, -2), 1e-6);
		 assertEquals("error in add()",  -4, Model.multiTwoNumbers(-2, 2), 1e-6);

		
	}
	}
