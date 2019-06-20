package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
