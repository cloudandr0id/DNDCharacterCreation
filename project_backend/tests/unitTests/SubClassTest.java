package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class SubClassTest
{
    Subclass subclass = new Subclass();

    @Test
    public void evaluateSubClassID()
    {
        subclass.setClassID(12);
        assertEquals(subclass.getClassID, 12);
    }

    @Test
    public void evaluateSubClassName()
    {
        subclass.setClassName("College-Of-Lore");
        assertEquals(subclass.getClassName, "College-Of-Lore");
    }


}
