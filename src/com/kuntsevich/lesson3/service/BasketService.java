package com.kuntsevich.lesson3.service;

import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;

import java.util.Random;

public class BasketService {

    public void fillBasket(Basket basket) {
        while (basket.add(generateBall())) ;
    }

    public Ball generateBall() {
        Random random = new Random();
        double weight = random.nextDouble() + 1;
        double volume = 10 * random.nextDouble() + 1;
        int color = random.nextInt(Color.values().length);
        Ball ball = null;
        try {
            ball = new Ball(Color.values()[color], weight, volume);
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
        return ball;
    }

    public int ballsCountByColor(Color color, Basket basket) {
        int count = 0;
        for (int i = 0; i < basket.size(); i++) {
            Ball ball = basket.get(i);
            if (ball != null && ball.getColor() == color) {
                count++;
            }
        }
        return count;
    }
}
