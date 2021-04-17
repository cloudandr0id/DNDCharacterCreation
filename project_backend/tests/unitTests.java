import Account;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class AccountMockTest
{
    @Mock
    Account account1 = new Account("email@gmail.com", "password123");

    @Test
    public void testAccountEmail()
    {
        String newEmail = "newEmail@gmail.com"
        account1.setEmail(newEmail);
        assertEquals(account1.email.getEmail(), newEmail);
    }

}

public class AccountUnitTests
{
    Account account = new Account(None, None);
    // Test 1: test account email
    @Test
    public void evaluateAccountEmail()
    {
        account.setEmail("Email@gmail.com");
        assertEquals(account.getEmail(), "Email@gmail.com");
    }
    // Test 2: test account password
    @Test
    public void evaluateAccountPassword()
    {
        account.setPassword("password123");
        assertEquals(account.getPassword(), "password123");
    }

}
