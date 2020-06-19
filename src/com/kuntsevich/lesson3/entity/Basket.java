package com.kuntsevich.lesson3.entity;

import java.util.List;

public class Basket {

    private double maxVolume;
    private double maxWeight;

    private List<Ball> balls;

    public Basket(int maxVolume, double maxWeight, List<Ball> balls) {
        this.maxVolume = maxVolume;
        this.maxWeight = maxWeight;
        this.balls = balls;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public Ball get(int index) {
        return balls.get(index);
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int size() {
        return balls.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Basket basket = (Basket) o;
        return this.maxVolume == basket.maxVolume
                && this.maxWeight == basket.maxWeight
                && this.balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(maxVolume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + balls.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("maxVolume=").append(maxVolume);
        sb.append(", maxWeight=").append(maxWeight);
        sb.append(", balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }

    public boolean add(Ball ball) {
        if (calcBallsVolume() + ball.getVolume() <= getMaxVolume()
                && calcBallsWeight() + ball.getWeight() <= getMaxWeight()) {
            balls.add(ball);
            return true;
        }
        return false;
    }

    public void clear() {
        balls.clear();
    }

    public double calcBallsVolume() {
        double volume = 0;
        for (Ball ball : balls) {
            volume += ball.getVolume();
        }
        return volume;
    }

    public double calcBallsWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }
}
