import static org.junit.Assert.*;


import org.junit.Test;

public class calcTestTest {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
		Model.divideTwoNumbers(9,0);
	      
	}

}
