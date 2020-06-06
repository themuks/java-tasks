package com.kuntsevich.lesson1.entity;

public class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return this.radius == circle.getRadius();
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius).append('}');
        return sb.toString();
    }

    public double calcCircumference() {
        return 2*Math.PI*radius;
    }

    public double calcAreaSize() {
        return Math.PI*Math.pow(radius, 2);
    }
}
