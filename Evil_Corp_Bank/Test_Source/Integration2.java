import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Integration2 {
	static ArrayList<Account> list =  new ArrayList<Account>();
	static ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	@Test
	public void test() {
	TransactionApp.readFile();
	TransactionApp.printAccounts();
	TransactionApp.find_Account("2");

	assertNotNull(list);

}
}
