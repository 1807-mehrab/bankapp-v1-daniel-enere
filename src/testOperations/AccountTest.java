package testOperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operations.Account;

class AccountTest {

	@Test
	void getAccountBalance() {
		Account account = new Account("Daniel");
		
		account.setBalance(100.00);
		
		assertEquals(100.00, account.getBalance());
		
	}
	
	@Test
	void getAccountHolder() {
		Account account = new Account("Daniel");
		
		assertEquals("Daniel", account.getAccountHolder());
		
	}

}
