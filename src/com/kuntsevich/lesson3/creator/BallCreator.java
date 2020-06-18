package com.kuntsevich.lesson3.creator;

import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.validator.ParameterValidator;

public class BallCreator {

    public Ball createBall(Color color, double weight, double volume) throws IncorrectDataException {
        ParameterValidator parameterValidator = new ParameterValidator();
        if (!parameterValidator.validateWeight(weight)
                || !parameterValidator.validateMaxVolume(volume)
                || color == null) {
            throw new IncorrectDataException("Incorrect ball parameters");
        }
        Ball ball = new Ball(color, weight, volume);
        return ball;
    }
}
