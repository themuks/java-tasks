package test.kuntsevich.lesson1.entity;

import com.kuntsevich.lesson1.entity.CustomFunction;
import com.kuntsevich.lesson1.entity.TangentCustomFunction;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentCustomFunctionTest {

    private CustomFunction customFunction = new TangentCustomFunction();

    @Test
    public void testGetValue() {
        double actual = customFunction.calcValue(2);
        double expected = Math.tan(2);
        assertEquals(actual, expected, 0.001);
    }
}