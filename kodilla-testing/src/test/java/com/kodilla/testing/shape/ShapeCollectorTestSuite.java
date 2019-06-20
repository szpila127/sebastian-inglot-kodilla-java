package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertTrue(shapeCollector.getFiguresQuantity() == 1);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Square square = new Square(4);
        Square square2 = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square2);
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Triangle triangle = new Triangle(4, 7);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //When
        Shape result;
        result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        Square square = new Square(6);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        ArrayList<Shape> test = new ArrayList<>();
        test.add(square);
        ArrayList<Shape> result = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(test, result);
    }

    @Test
    public void testGetField() {
        //Given
        Square square = new Square(7);
        Circle cirlce = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(cirlce);
        //When
        double fieldSquare = shapeCollector.getFigure(0).getField();
        String nameSquare = shapeCollector.getFigure(0).getShapeName();
        double fieldCircle = shapeCollector.getFigure(1).getField();
        String nameCircle = shapeCollector.getFigure(1).getShapeName();
        //Then
        Assert.assertEquals(49, fieldSquare, 0.01);
        Assert.assertEquals("square", nameSquare);
        Assert.assertEquals(78.5, fieldCircle, 0.01);
        Assert.assertEquals("circle", nameCircle);
    }

}
