package testOperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.banking.beans.Account;

class AccountTest {

	@Test
	void getAccountBalance() {
		Account account = new Account();
		
		account.setBalance(100.00);
		
		assertEquals(100.00, account.getBalance());
		
	}
	
	@Test
	void getAccountHolder() {
		Account account = new Account();
		account.getUser().setName("Daniel");
		
		assertEquals("Daniel", account.getUser().getName());
		
	}

}
