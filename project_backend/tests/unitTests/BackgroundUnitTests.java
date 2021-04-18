package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class BackgroundUnitTests
{
    Background background = new Background();

    @Test
    public void evaluateBackgroundID()
    {
        background.setBackgroundID(10);
        assertEquals(background.getBackgroundID(), 10);
    }

    @Test
    public void evaluateTitle()
    {
        background.setTitle("Pirate");
        assertEquals(background.getTitle(), "Pirate");
    }

    @Test
    public void evaluateDescription()
    {
        background.setDescription("Raised by pirates");
        assertEquals(background.Description(), "Raised by pirates");
    }

}
