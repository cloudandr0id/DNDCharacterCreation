package database_classes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class AbilityScoreTest
{
    AbilityScore score_data = new AbilityScore(15, 12, 14, 18, 10, 9);

    @Test
    public void evaluateCaculation()
    {
        int[] calculated = score_data.calculateScore();
        assertEquals(calculated, [15, 12, 14, 18, 10, 9]);
    }

    @Test
    public void evaluateModifiers()
    {
        int mod = score_data.scoreToModifier(15);
        assertEquals(mod, 2);
    }

    @Test
    public void evaluateModifiers()
    {
        int mod = score_data.scoreToModifier(20);
        assertEquals(mod, 5);
    }

    @Test
    public void evaluateModifiers()
    {
        int mod = score_data.scoreToModifier(1);
        assertEquals(mod, -5);
    }

}
