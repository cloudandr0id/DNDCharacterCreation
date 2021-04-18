package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class LevelUnitTests
{
    Level level = new Level();

    @Test
    public void evaluateLevel()
    {
        level.setLevel(1);
        assertEquals(level.getLevel(), 1);
    }

    @Test
    public void evaluateProficiency()
    {
        level.setProficiency(10);
        assertEquals(level.getProficiency(), 10);
    }

}
