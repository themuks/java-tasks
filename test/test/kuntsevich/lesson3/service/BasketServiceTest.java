package test.kuntsevich.lesson3.service;

import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.service.BasketService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasketServiceTest {

    private BasketService basketService = new BasketService();

    @Test
    public void testAddBallPositive() {
        try {
            assertTrue(basketService.addBall(new Basket(2, 2), new Ball(Color.BLUE, 1)));
        } catch (IncorrectDataException e) {
            fail();
        }
    }

    @Test
    public void testAddBallNegative() {
        try {
            assertFalse(basketService.addBall(new Basket(1, 1), new Ball(Color.BLUE, 2)));
        } catch (IncorrectDataException e) {
            fail();
        }
    }

    @Test
    public void testFillBasket() {
        Basket basket = null;
        try {
            basket = new Basket(10, 100);
        } catch (IncorrectDataException e) {
            fail();
        }
        basketService.fillBasket(basket);
        boolean result = false;
        if (basket.getMaxWeight() >= basketService.calcBallsWeight(basket)
                && basket.getBalls().size() <= basket.getMaxCount()) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testCalcBallsWeight() {
        Basket basket = null;
        try {
            basket = new Basket(10, 100);
            basketService.addBall(basket, new Ball(Color.BLUE, 1));
            basketService.addBall(basket, new Ball(Color.RED, 2));
        } catch (IncorrectDataException e) {
            fail();
        }
        assertEquals(3, basketService.calcBallsWeight(basket), 0.001);
    }

    @Test
    public void testBlueBallsCount() {
        Basket basket = null;
        try {
            basket = new Basket(10, 100);
            basketService.addBall(basket, new Ball(Color.BLUE, 1));
            basketService.addBall(basket, new Ball(Color.RED, 2));
        } catch (IncorrectDataException e) {
            fail();
        }
        assertEquals(1, basketService.blueBallsCount(basket));
    }
}