package database_classes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class ClassTraitsTest
{
    ClassTraits classtraits = new ClassTraits();

    @Test
    public void evaluateClassTrait()
    {
        classtraits.setClassTrait(10);
        assertEquals(classtraits.getClassTrait, 10);
    }


}
