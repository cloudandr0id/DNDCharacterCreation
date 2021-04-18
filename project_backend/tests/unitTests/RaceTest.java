package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class RaceTest
{
    Race race = new Race();

    @Test
    public void evaluateRaceID()
    {
        race.setRaceID(1);
        assertEquals(race.getRaceID(), 1);
    }

    @Test
    public void evaluateRaceName()
    {
        race.setRaceName("Human");
        assertEquals(race.getRaceName(), "Human");
    }

    @Test
    public void evaluateRaceTrait()
    {
        race.setRaceTrait(2);
        assertEquals(race.getRaceTrait(), 2);
    }

    @Test
    public void evaluateRaceSpeed()
    {
        race.setRaceTrait(25);
        assertEquals(race.getRaceTrait(), 25);
    }

}
