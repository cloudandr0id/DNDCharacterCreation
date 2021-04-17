package database_classes;

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
        String newEmail = "newEmail@gmail.com";
        account1.setEmail(newEmail);
        assertEquals(account1.email.getEmail(), newEmail);
    }

}
