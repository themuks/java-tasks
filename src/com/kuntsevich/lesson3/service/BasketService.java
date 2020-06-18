package com.kuntsevich.lesson3.service;

import com.kuntsevich.lesson3.creator.BallCreator;
import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;

import java.util.Random;

public class BasketService {

    public void fillBasket(Basket basket) {
        if (basket != null) {
            Ball ball = generateBall();
            while (basket.add(ball)) ;
        }
    }

    public Ball generateBall() {
        Random random = new Random();
        double weight = random.nextDouble() + 1;
        double volume = 10 * random.nextDouble() + 1;
        int color = random.nextInt(Color.values().length);
        BallCreator ballCreator = new BallCreator();
        Ball ball = null;
        try {
            ball = ballCreator.createBall(Color.values()[color], weight, volume);
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
        return ball;
    }

    public int ballsCountByColor(Color color, Basket basket) {
        int count = 0;
        if (color != null && basket != null) {
            for (int i = 0; i < basket.size(); i++) {
                Ball ball = basket.get(i);
                if (ball != null && ball.getColor() == color) {
                    count++;
                }
            }
        }
        return count;
    }
}
