package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class AccountUnitTests
{
    Account account = new Account(None, None);

    @Test
    public void evaluateAccountEmail()
    {
        account.setEmail("Email@gmail.com");
        assertEquals(account.getEmail(), "Email@gmail.com");
    }
    
    @Test
    public void evaluateAccountPassword()
    {
        account.setPassword("password123");
        assertEquals(account.getPassword(), "password123");
    }

}
