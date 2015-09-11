import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

//test read and print together
public class Integration1 {

	@Test
	public void test() {
		
		TransactionApp.readFile();
		TransactionApp.printAccounts();
	}

}
