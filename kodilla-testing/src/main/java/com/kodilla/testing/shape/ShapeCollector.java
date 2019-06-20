package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();


    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public ArrayList<Shape> showFigures() {
        return figures;
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}
