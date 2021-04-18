package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class SubRaceTest
{
    SubRace subrace = new SubRace();

    @Test
    public void evaluateRaceID()
    {
        subrace.setRaceID(10);
        assertEquals(subrace.getRaceID, 10);
    }

    @Test
    public void evaluateRaceName()
    {
        subrace.setRaceName("Wood-Elf");
        assertEquals(subrace.getRaceName, "Wood-Elf");
    }

}
