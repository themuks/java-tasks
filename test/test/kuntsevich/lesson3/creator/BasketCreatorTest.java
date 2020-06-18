package test.kuntsevich.lesson3.creator;

import com.kuntsevich.lesson3.creator.BasketCreator;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.exception.IncorrectDataException;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class BasketCreatorTest {

    BasketCreator basketCreator = new BasketCreator();

    @Test
    public void testCreateBasketPositive() {
        Basket actual = null;
        try {
            actual = basketCreator.createBasket(1, 2, new ArrayList<>());
        } catch (IncorrectDataException e) {
            fail();
        }
        Basket expected = new Basket(1, 2, new ArrayList<>());
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCreateBasketException() throws IncorrectDataException {
        basketCreator.createBasket(-1, 2, new ArrayList<>());
    }
}