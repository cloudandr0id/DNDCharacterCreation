package database_classes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class RaceTraitsTest
{
    RaceTraits racetraits = new RaceTraits();

    @Test
    public void evaluateRaceTrait()
    {
        racetraits.setRaceTrait(2);
        assertEquals(racetraits.getRaceTrait, 2);
    }

    @Test
    public void evaluateRaceSpeed()
    {
        racetraits.setRaceTrait(25);
        assertEquals(racetraits.getRaceTrait, 25);
    }

}
