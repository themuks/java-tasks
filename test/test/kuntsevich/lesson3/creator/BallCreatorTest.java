package test.kuntsevich.lesson3.creator;

import com.kuntsevich.lesson3.creator.BallCreator;
import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BallCreatorTest {

    BallCreator ballCreator = new BallCreator();

    @Test
    public void testCreateBallPositive() {
        Ball actual = null;
        try {
            actual = ballCreator.createBall(Color.RED, 1, 2);
        } catch (IncorrectDataException e) {
            fail();
        }
        Ball expected = new Ball(Color.RED, 1, 2);
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCreateBallException() throws IncorrectDataException {
        ballCreator.createBall(Color.RED, -1, 2);
    }
}