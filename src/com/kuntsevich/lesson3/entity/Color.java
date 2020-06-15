package com.kuntsevich.lesson3.entity;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow"),
    PINK("Pink"),
    ORANGE("Orange"),
    BLACK("Black"),
    WHITE("White"),
    GREY("Grey"),
    PURPLE("Purple");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
