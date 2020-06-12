package test.kuntsevich.lesson1.entity;

import com.kuntsevich.lesson1.entity.EquationCustomFunction;
import com.kuntsevich.lesson1.entity.CustomFunction;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EquationCustomFunctionTest {

    private CustomFunction customFunction = new EquationCustomFunction();

    @Test
    public void testGetValue() {
        double actual = customFunction.calcValue(2);
        double expected = 0.5;
        assertEquals(actual, expected, 0.001);
    }
}