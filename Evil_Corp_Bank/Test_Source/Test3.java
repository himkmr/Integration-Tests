import static org.junit.Assert.*;

import org.junit.Test;


public class Test3 {

	@Test
	public void validate_Date() {
		assertTrue(Validation.validate_Date("01\\01\\01"));

	}

	@Test
	public void validate_Date2() {
		assertFalse(Validation.validate_Date("01\\\\01"));

	}

	@Test
	public void validate_Date3() {
		assertFalse(Validation.validate_Date("01\01\\01"));
	}

}
