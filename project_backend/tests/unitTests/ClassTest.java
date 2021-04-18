package tests.unitTests;
package classes.databaseClasses;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class ClassTest
{
    Class class = new Class();

    @Test
    public void evaluateClassID()
    {
        class.setClassID(10);
        assertEquals(class.getClassID, 10);
    }

    @Test
    public void evaluateClassName()
    {
        class.setClassName("Wizard");
        assertEquals(class.getClassName, "Wizard");
    }

    @Test
    public void evaluateClassTrait()
    {
        class.setClassTrait(2);
        assertEquals(class.getClassTrait, 2);
    }

}
