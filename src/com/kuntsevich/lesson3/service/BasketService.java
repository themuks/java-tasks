package com.kuntsevich.lesson3.service;

import com.kuntsevich.lesson3.entity.Ball;
import com.kuntsevich.lesson3.entity.Basket;
import com.kuntsevich.lesson3.entity.Color;
import com.kuntsevich.lesson3.exception.IncorrectDataException;

import java.util.List;
import java.util.Random;

public class BasketService {

    public boolean addBall(Basket basket, Ball ball) {
        List<Ball> balls = basket.getBalls();
        if (balls.size() < basket.getMaxCount() && calcBallsWeight(basket) + ball.getWeight() <= basket.getMaxWeight()) {
            balls.add(ball);
            return true;
        }
        return false;
    }

    public void fillBasket(Basket basket) {
        while (addBall(basket, generateBall()));
    }

    public Ball generateBall() {
        Random random = new Random();
        double weight = random.nextDouble() + 1;
        int color = random.nextInt(Color.values().length);
        Ball ball = null;
        try {
            ball = new Ball(Color.values()[color], weight);
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
        return ball;
    }

    public double calcBallsWeight(Basket basket) {
        double weight = 0;
        for (Ball ball : basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int blueBallsCount(Basket basket) {
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
