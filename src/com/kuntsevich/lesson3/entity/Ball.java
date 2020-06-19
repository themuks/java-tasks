package com.kuntsevich.lesson3.entity;

public class Ball {

    private Color color;
    private double weight;
    private double volume;

    public Ball(Color color, double weight, double volume) {
        this.color = color;
        this.weight = weight;
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return this.color == ball.color
                && this.weight == ball.weight
                && this.volume == ball.volume;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color=").append(color);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }
}
