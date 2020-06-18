package test.kuntsevich.lesson3.service;

import com.kuntsevich.lesson3.creator.BallCreator;
import com.kuntsevich.lesson3.creator.BasketCreator;
import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.service.BasketService;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class BasketServiceTest {

    private BasketService basketService = new BasketService();
    private BallCreator ballCreator = new BallCreator();
    private BasketCreator basketCreator = new BasketCreator();

    @Test
    public void testAddPositive() {
        try {
            Basket basket = basketCreator.createBasket(200, 2, new ArrayList<>());
            Ball ball = ballCreator.createBall(Color.BLUE, 1, 10);
            assertTrue(basket.add(ball));
        } catch (IncorrectDataException e) {
            fail();
        }
    }

    @Test
    public void testAddNegative() {
        try {
            Basket basket = basketCreator.createBasket(100, 1, new ArrayList<>());
            Ball ball = ballCreator.createBall(Color.BLUE, 2, 20);
            assertFalse(basket.add(ball));
        } catch (IncorrectDataException e) {
            fail();
        }
    }

    @Test
    public void testFillBasket() {
        Basket basket = null;
        try {
            basket = basketCreator.createBasket(1000, 100, new ArrayList<>());
        } catch (IncorrectDataException e) {
            fail();
        }
        basketService.fillBasket(basket);
        boolean result = false;
        if (basket.getMaxWeight() >= basket.calcBallsWeight()
                && basket.calcBallsVolume() <= basket.getMaxVolume()) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testBallsCountByColor() {
        Basket basket = null;
        try {
            basket = basketCreator.createBasket(1000, 100, new ArrayList<>());
            basket.add(ballCreator.createBall(Color.BLUE, 1, 10));
            basket.add(ballCreator.createBall(Color.RED, 2, 20));
        } catch (IncorrectDataException e) {
            fail();
        }
        assertEquals(1, basketService.ballsCountByColor(Color.BLUE, basket));
    }

    @Test
    public void testGenerateBall() {
        assertNotNull(basketService.generateBall());
    }
}