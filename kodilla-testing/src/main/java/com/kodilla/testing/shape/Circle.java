package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return 3.14 * r * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
