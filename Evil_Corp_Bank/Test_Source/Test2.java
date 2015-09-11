import static org.junit.Assert.*;

import org.junit.Test;


public class Test2 {

	@Test
	public void validate_amount() {
		assertTrue(Validation.validate_Amount("234.45"));

	}

	@Test
	public void validate_amount2() {
		assertFalse(Validation.validate_Amount(".45"));

	}

	@Test
	public void validate_amount3() {
		assertFalse(Validation.validate_Amount("234."));

	}

	@Test
	public void validate_amount4() {
		assertTrue(Validation.validate_Amount("234"));

	}


}
