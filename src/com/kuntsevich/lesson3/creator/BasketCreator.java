package com.kuntsevich.lesson3.creator;

import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.validator.ParameterValidator;

import java.util.List;

public class BasketCreator {

    public Basket createBasket(int maxVolume, double maxWeight, List<Ball> balls) throws IncorrectDataException {
        ParameterValidator parameterValidator = new ParameterValidator();
        if (!parameterValidator.validateMaxVolume(maxVolume)
                || !parameterValidator.validateMaxWeight(maxWeight)
                || balls == null) {
            throw new IncorrectDataException("Incorrect basket parameters");
        }
        Basket basket = new Basket(maxVolume, maxWeight, balls);
        return basket;
    }
}
